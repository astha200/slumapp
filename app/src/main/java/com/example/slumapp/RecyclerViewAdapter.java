package com.example.slumapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends
        RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private List<RecyclerListData> sublist;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, date, status;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            date = (TextView) view.findViewById(R.id.date);
            status = (TextView) view.findViewById(R.id.status);
        }
    }


    public RecyclerViewAdapter(List<RecyclerListData> sublist) {

        this.sublist = sublist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listview, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RecyclerListData list  = sublist.get(position);
        holder.name.setText(list.getName());
        holder.date.setText(list.getDate());
        holder.status.setText(list.getStatus());
    }

    @Override
    public int getItemCount()
    {

        return sublist.size();
    }

}
