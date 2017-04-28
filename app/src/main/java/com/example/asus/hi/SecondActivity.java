package com.example.asus.hi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    public boolean checkFull(){
        EditText editText=(EditText)findViewById(R.id.editText6);
        EditText editText1=(EditText)findViewById(R.id.editText7);
        return !(editText.getText().toString().equals("")&&editText1.getText().toString().equals(""));

    }
    public boolean checkRight(){
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button=(Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(checkFull()){
                    if(checkRight()){
                        Toast.makeText(SecondActivity.this,"Welcome",Toast.LENGTH_SHORT
                        ).show();
                        Intent intent=new Intent(SecondActivity.this,FourthActivity.class);
                        startActivity(intent);
                    }
                    else {
                    //待后续开发
                    }
                }
                else Toast.makeText(SecondActivity.this,"Please Enter All The Information",Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
