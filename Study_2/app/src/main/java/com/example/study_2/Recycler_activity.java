package com.example.study_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Recycler_activity extends AppCompatActivity {
    private ArrayList<RecycleData> arrayList;
    private Recycle_adapter Recycle_adapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager LinearLayoutManager;   // 리사이클러뷰에서 사용되는 기능

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = (RecyclerView) findViewById(R.id.rec_view);
        LinearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(LinearLayoutManager);

        arrayList = new ArrayList<>();

        Recycle_adapter = new Recycle_adapter(arrayList);
        recyclerView.setAdapter(Recycle_adapter);


        Button btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RecycleData recycleData = new RecycleData(R.mipmap.ic_launcher, "안드로이드", "RecyclerView");
                arrayList.add(recycleData);
                Recycle_adapter.notifyDataSetChanged();
            }
        });

    }
}