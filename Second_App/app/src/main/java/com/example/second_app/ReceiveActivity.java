package com.example.second_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    private TextView mTvReceiveName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        mTvReceiveName = findViewById(R.id.tvReceiveName);
        String name = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        mTvReceiveName.setText(name);
    }
}