package com.example.slumapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
//import android.support.v7.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<RecyclerListData> sublist = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerViewAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        mAdapter=new RecyclerViewAdapter(sublist);
        RecyclerView.LayoutManager mLayoutManager = new
                LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(mLayoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareListData();
    }

    private void prepareListData(){
        RecyclerListData list=new RecyclerListData("xyz","11-8-19","completed");
        sublist.add(list);

        list=new RecyclerListData("xyz","11-8-19","completed");
        sublist.add(list);

         list=new RecyclerListData("xyz","11-8-19","completed");
        sublist.add(list);

        list=new RecyclerListData("xyz","11-8-19","completed");
        sublist.add(list);

        list=new RecyclerListData("xyz","11-8-19","completed");
        sublist.add(list);

        list=new RecyclerListData("xyz","11-8-19","completed");
        sublist.add(list);

        list=new RecyclerListData("xyz","11-8-19","completed");
        sublist.add(list);

        list=new RecyclerListData("xyz","11-8-19","completed");
        sublist.add(list);

        list=new RecyclerListData("xyz","11-8-19","completed");
        sublist.add(list);

        mAdapter.notifyDataSetChanged();
    }
}
