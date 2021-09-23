package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends ArrayAdapter<User> {


    public ListAdapter (@NonNull Context context, ArrayList<User> userArrayAdapter){
        super(context, R.layout.item_list, (List<User>) userArrayAdapter);
    }

@NonNull
@Override
        public View getView (int possirion, @NonNull View convertView, @NonNull ViewGroup parent){
        //return super.getView(possirion, convertView, parent)
       User user = getItem(possirion);

       if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
       ImageView imageView = convertView.findViewById(R.id.imageView);
       TextView userName = convertView.findViewById(R.id.personName);
       TextView lastMsg = convertView.findViewById(R.id.lastMessage);
       TextView time = convertView.findViewById(R.id.msgtime);

       imageView.setImageResource(user.IdImage);
       userName.setText(user.Name);
       lastMsg.setText(user.LastMessage);
       time.setText(user.MessTime);
       return convertView;
    }
//    public ListAdapter(@NonNull Context context, int resource, int textViewResourceId) {
//        super(context, resource, textViewResourceId);
//
//
//
//
//
//
//
//        ImageView imageView = convertView.findViewById(R.id.imageView);
//        TextView userName = convertView.findViewById(R.id.personName);
//        return null;
//    }

}
