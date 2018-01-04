package com.girish.newtask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class RxMainActivity extends AppCompatActivity {

    private RecyclerView list;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;


    private Button SDAFSGFD;

    List<String> names = new ArrayList<>();
    List<String> ages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rx_activity_main);

        list = (RecyclerView) findViewById(R.id.list);
        SDAFSGFD = (Button) findViewById(R.id.SDAFSGFD);

        layoutManager = new LinearLayoutManager(RxMainActivity.this);
        list.setLayoutManager(layoutManager);
        adapter = new RxAdapter(RxMainActivity.this,names, ages);
        list.setAdapter(adapter);


        names.add("girish");
        names.add("raju");

        ages.add("210");
        ages.add("4205");

        SDAFSGFD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                adapter.notifyDataSetChanged();
            }
        });


    }


}
