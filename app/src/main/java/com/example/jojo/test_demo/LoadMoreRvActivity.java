package com.example.jojo.test_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;


/**
 * 可load more的RecyclerView
 * https://www.jianshu.com/p/3bf125b4917d
 */
public class LoadMoreRvActivity extends AppCompatActivity {


    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_more_rv);
        recyclerview = findViewById(R.id.recyclerview);
    }
}
