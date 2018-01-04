package com.girish.newtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.girish.newtask.model.AdapterMinistatement;
import com.girish.newtask.model.HandShakeInput;
import com.girish.newtask.model.HandShakeResult;
import com.girish.newtask.model.LoginResult;
import com.girish.newtask.model.MiniGetrSetr;
import com.girish.newtask.model.T24_MiniStatementInput;
import com.girish.newtask.model.T24_MiniStatementResult;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    ApplicationService service;

    List<MiniGetrSetr> mSetrGetrList = new ArrayList<>();

    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;

    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (RecyclerView) findViewById(R.id.list);


        mLayoutManager = new LinearLayoutManager(this);
        list.setLayoutManager(mLayoutManager);

        adapter = new AdapterMinistatement(this, mSetrGetrList);

        list.setAdapter(adapter);


        findViewById(R.id.call_url).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Retrofit retrofit = Utils.getRetrofitBuilder(MainActivity.this);
                service = retrofit.create(ApplicationService.class);


                service.doHandShake(new HandShakeInput("demo")).enqueue(new Callback<HandShakeResult>() {
                    @Override
                    public void onResponse(Call<HandShakeResult> call, Response<HandShakeResult> response) {

                        Toast.makeText(MainActivity.this, response.body().getRemark(), Toast.LENGTH_SHORT).show();


                    }

                    @Override
                    public void onFailure(Call<HandShakeResult> call, Throwable t) {


                    }
                });

            }
        });


        findViewById(R.id.call_urll_lsd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                showlist();


            }
        });


    }

    private void showlist() {

        LoginResult loginResult = new LoginResult(true, "11223333", "1111");

        T24_MiniStatementInput input = new T24_MiniStatementInput(loginResult,
                "548451555",
                "1111",
                "1234",
                "0.0",
                "0.0",
                "5884848494848");

        Retrofit retrofit = Utils.getRetrofitBuilder(MainActivity.this);
        service = retrofit.create(ApplicationService.class);

        service.T24_MiniStatement(input).enqueue(new Callback<T24_MiniStatementResult>() {
            @Override
            public void onResponse(Call<T24_MiniStatementResult> call, Response<T24_MiniStatementResult> response) {

                Toast.makeText(MainActivity.this, "getting Response", Toast.LENGTH_SHORT).show();
                T24_MiniStatementResult result = response.body();

                System.out.println(" result " + result.IsValid + " Remarks: " + result.Remarks + " EachTrans: " + result.EachStatement);


                for (int i = 0; i < result.EachStatement.size(); i++) {
                    T24_MiniStatementResult.EachStatement et = result.EachStatement.get(i);

                    mSetrGetrList.add(new MiniGetrSetr("RS", et.Des, et.Amount, et.Date, et.TranNo, et.TransType));
                }

                adapter.notifyDataSetChanged();


            }

            @Override
            public void onFailure(Call<T24_MiniStatementResult> call, Throwable t) {

            }
        });


    }

}
