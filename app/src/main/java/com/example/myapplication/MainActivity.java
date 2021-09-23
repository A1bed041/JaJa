package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        int[] IdImage = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i};
        String[] Name = {"Руслан", "Василиса", "Роман", "Елизавета", "Дарья", "Адель", "Артём", "Елисей", "Максим", "Мария"};
        String[] LastMessage = {"Хочу", "сказать", "этому", "ОБЭМЕ", "ты", "козёл", "черножопый", " был бы ты", "человек"};
        String[] Phone = {"45(51)229-93-05", "3(7461)523-00-77", "633(59)515-50-85", "89(530)760-06-17", "04(4533)954-46-39", "1(6727)935-00-68", "72(18)575-02-96", "99(8641)017-52-72", "2(34)216-96-71"};
        String[] Contry = {"Расия", "Расия", "Расия", "Расия", "Расия", "Расия", "Расия", "Расия", "Расия"};
        String[] MessTime = {"6:66", "6:66", "6:66", "6:66", "6:66", "6:66", "6:66", "6:66", "6:66", "6:66"};

        ArrayList <User> userArrayList = new ArrayList<>();
        for(int i=0; i<IdImage.length; i++)
        {
            User user = new User(Name[i],LastMessage[i],Phone[i],Contry[i],MessTime[i],IdImage[i]);
                userArrayList.add(user);
        }

        ListAdapter listAdapter = new ListAdapter(MainActivity.this, userArrayList);
        listView.setAdapter(listAdapter);
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent I = new Intent(MainActivity.this, UserActivity.class);
                I.putExtra("name",Name[i]);
                I.putExtra("LastMessage",LastMessage[i]);
                I.putExtra("Phone",Phone[i]);
                I.putExtra("Contry",Contry[i]);
                I.putExtra("MessTime",MessTime[i]);
                I.putExtra("IdImage",IdImage[i]);

                startActivity(I);
            }
        });

    }
}