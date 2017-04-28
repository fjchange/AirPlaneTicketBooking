package com.example.asus.hi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class title extends LinearLayout {

    public title(Context context,AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button titleBack=(Button)findViewById(R.id.title_left);
        Button titleMore=(Button)findViewById(R.id.title_right);
        TextView textView=(TextView)findViewById(R.id.title_content);
        textView.setText("Time·日晷");
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        titleMore.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"You clicked more button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

