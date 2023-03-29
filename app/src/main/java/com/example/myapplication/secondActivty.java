package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivty extends AppCompatActivity {
  TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activty);
        receiver_msg=(TextView)findViewById(R.id.received_value_id);
        Intent intent=getIntent();
        String str=intent.getStringExtra("massage_key");
        receiver_msg.setText("Hello, "+str+"!");

    }
}