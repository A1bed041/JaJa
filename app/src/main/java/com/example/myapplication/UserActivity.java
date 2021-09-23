package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    ImageView profile_image;
    TextView phone_profile;
    TextView country_profile,name_profile;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        profile_image= findViewById(R.id.profile_image);
        phone_profile= findViewById(R.id.phone_profile);
        country_profile= findViewById(R.id.country_profile);
        name_profile= findViewById(R.id.name_profile);


        Intent intent2 = this.getIntent();

        if (intent2!=null){
            String Name = intent2.getStringExtra("name");
            String LastMessage = intent2.getStringExtra("LastMessage");
            String Phone = intent2.getStringExtra("Phone");
            String Contry = intent2.getStringExtra("Contry");
            String MessTime = intent2.getStringExtra("MessTime");
            int IdImage = intent2.getIntExtra("IdImage", R.drawable.a);

            name_profile.setText(Name);
            phone_profile.setText(Phone);
            country_profile.setText(Contry);
            profile_image.setImageResource(IdImage);
        };
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
