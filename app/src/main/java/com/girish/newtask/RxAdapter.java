package com.girish.newtask;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Dell-PC on 12/16/2017.
 */

public class RxAdapter extends RecyclerView.Adapter<RxAdapter.ViewHolder> {

    private List<String> namess, agee;

    Context context;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, ages;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            ages = (TextView) itemView.findViewById(R.id.ages);
        }
    }

    public RxAdapter(Context context, List<String> names, List<String> age) {
        namess = names;
        agee = age;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rx_items, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RxAdapter.ViewHolder holder, final int position) {

        holder.name.setText(namess.get(position));
        holder.ages.setText(agee.get(position));

        holder.ages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, agee.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return namess.size();
    }
}
