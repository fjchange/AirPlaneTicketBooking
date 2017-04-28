package com.example.asus.hi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    final static String TAG="MainActivity";
    public boolean checkFuLL(){
        EditText editText=(EditText)findViewById(R.id.editText);
        EditText editText2=(EditText)findViewById(R.id.editText2);
        EditText editText3=(EditText)findViewById(R.id.editText3);
        EditText editText4=(EditText)findViewById(R.id.editText4);
        EditText editText5=(EditText)findViewById(R.id.editText5);

        return !(editText.getText().toString().equals("")&&editText2.getText().toString().equals("")&&editText3.getText().toString().equals("")&&editText4.getText().toString().equals("")&&editText5.getText().toString().equals(""));
    }
    public boolean checkPassWord(){
        EditText editText=(EditText)findViewById(R.id.editText4);
        EditText editText1=(EditText)findViewById(R.id.editText5);
        String PassWord=editText.getText().toString();
        String PassWord1=editText1.getText().toString();
        return PassWord.equals(PassWord1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText editText=(EditText)findViewById(R.id.editText4);
                EditText editText1=(EditText)findViewById(R.id.editText5);
                EditText editText2=(EditText)findViewById(R.id.editText);
                final String name=editText2.getText().toString();
                if(checkFuLL()){
                    if(checkPassWord()){
                        Log.i(TAG,"All the input are correct");
                        Toast.makeText(MainActivity.this,"Welcome "+name,Toast.LENGTH_SHORT
                        ).show();
                        Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
                        intent.putExtra("extra_name",name);
                        startActivity(intent);
                    }
                    else{
                        Log.i(TAG,"Wrong PassWord input");
                        editText.setText("");
                        editText1.setText("");
                        Toast.makeText(MainActivity.this,"The PassWords You Enter are different,Please ReEnter",Toast.LENGTH_SHORT
                        ).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this,"Please Enter All The Information",Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });
        Button button1=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
