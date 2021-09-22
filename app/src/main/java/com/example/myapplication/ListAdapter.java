package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ListAdapter extends ArrayAdapter<User> {

    public ListAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);


    }

    public View getView (int possirion, View convertView, ViewGroup parent){

        User user = getItem(possirion);
        if (convertView == null){
            //convertView = LayoutInflater.from(getContext().getApplicationInfo())
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView userName = convertView.findViewById(R.id.personName);
        return null;
    }

}
