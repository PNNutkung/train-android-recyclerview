package com.example.nut.samplerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nut.samplerecyclerview.adapter.ItemAdapter;
import com.example.nut.samplerecyclerview.model.Storage;

public class MainActivity extends AppCompatActivity {
    private Storage storage;
    private ItemAdapter itemAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_container);
        storage = Storage.getInstance();
        RecyclerView.LayoutManager linearLayoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
//        recyclerView.setItemAnimator();
        itemAdapter = new ItemAdapter(storage.getList(), this);
        recyclerView.setAdapter(itemAdapter);


//        itemAdapter.notifyItemInserted();
        recyclerView.setHasFixedSize(true);
    }
}
