package com.girish.newtask.model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.girish.newtask.R;

import java.util.List;

/**
 * Created by Dell-PC on 12/13/2017.
 */

public class AdapterMinistatement extends RecyclerView.Adapter<AdapterMinistatement.ViewHolder> {

    private List<MiniGetrSetr> objects;
    private Context context;


    public AdapterMinistatement(Context context, List<MiniGetrSetr> objects) {
        this.objects = objects;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_amount_type, txt_transDetails, txt_amount, txt_trans_date, txt_colored_dot, txt_trans_no;

        public ViewHolder(View itemView) {
            super(itemView);

            txt_amount_type = (TextView) itemView.findViewById(R.id.txt_amount_type);
            txt_transDetails = (TextView) itemView.findViewById(R.id.txt_transDetails);
            txt_amount = (TextView) itemView.findViewById(R.id.txt_amount);
            txt_trans_date = (TextView) itemView.findViewById(R.id.txt_trans_date);
            txt_colored_dot = (TextView) itemView.findViewById(R.id.txt_colored_dot);
            txt_trans_no = (TextView) itemView.findViewById(R.id.txt_trans_no);


        }
    }


    @Override
    public AdapterMinistatement.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycleview_ministatement_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AdapterMinistatement.ViewHolder holder, int position) {

        MiniGetrSetr getrSetr = objects.get(position);


        holder.txt_amount.setText(getrSetr.getAmount());


    }

    @Override
    public int getItemCount() {
        return objects.size();
    }


}
