package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = this.getIntent();

        if (intent!=null){
            String Name = intent.getStringExtra("name");
            String LastMessage = intent.getStringExtra("LastMessage");
            String Phone = intent.getStringExtra("Phone");
            String Contry = intent.getStringExtra("Contry");
            String MessTime = intent.getStringExtra("MessTime");
            int IdImage = intent.getIntExtra("IdImage", R.drawable.a);
        };
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
