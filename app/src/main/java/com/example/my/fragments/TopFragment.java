package com.example.my.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class TopFragment extends Fragment{
private Button button;
private TextView editText;
private String textView;

    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
     View view= inflater.inflate(R.layout.top_fragment,container,false);
     generate(view);
     button=view.findViewById(R.id.generator);
     editText=view.findViewById(R.id.random);

     return view;
    }
    public void generate(View view){
        Random rand= new Random();
        int number=rand.nextInt(5)+1;
        TextView random=(TextView)view.findViewById(R.id.random);
        String mystring= String.valueOf(number);
        random.setText(mystring);
        }



}
