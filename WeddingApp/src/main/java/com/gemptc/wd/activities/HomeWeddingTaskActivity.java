package com.gemptc.wd.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.FragmentApplication.R;

public class HomeWeddingTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_wedding_task);
        Intent intent=getIntent();
    }

    public void addTask(View view) {
        Intent intent=new Intent(HomeWeddingTaskActivity.this,SelectWeddingTaskActivity.class);
        startActivity(intent);
        Intent intent1=getIntent();
    }
}
