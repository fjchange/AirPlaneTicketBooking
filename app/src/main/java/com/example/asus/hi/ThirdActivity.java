package com.example.asus.hi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.*;
import android.util.Log;
import java.io.IOException;
import android.widget.Button;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
   // static int number=0;
    final static String TAG="ThirdActivity";
    private final int IMAGE_CODE=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        final ImageButton imageButton=(ImageButton)findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            /*number++;
                if(number%2==1)
                    ((ImageButton)v).setImageDrawable(getDrawable(R.drawable.ic_button));
                else
                    ((ImageButton)v).setImageDrawable(getDrawable(R.drawable.ic));*/
                Intent intent=new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent,IMAGE_CODE);

            }
        });
        RadioGroup radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radbtn=(RadioButton)findViewById(checkedId);
                Toast.makeText(getApplicationContext(),"You chose "+radbtn.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        Button button=(Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(ThirdActivity.this,FourthActivity.class);
                Intent _intent=getIntent();
                String _name=_intent.getStringExtra("extra_name");
                Toast.makeText(getApplicationContext(),"Welcome to the new World "+_name,Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

   @Override
   protected void onActivityResult(int requestCode, int resultCode, Intent data){
       if (resultCode != RESULT_OK) {        //此处的 RESULT_OK 是系统自定义得一个常量
           Log.e(TAG,"ActivityResult resultCode error");
           return;
       }
       Bitmap bm =null;
       //外界的程序访问ContentProvider所提供数据 可以通过ContentResolver接口
       ContentResolver resolver = getContentResolver();
       //此处的用于判断接收的Activity是不是你想要的那个
       if (requestCode == IMAGE_CODE) {
           try {
               Uri originalUri = data.getData();        //获得图片的uri
               bm = MediaStore.Images.Media.getBitmap(resolver, originalUri);        //显得到bitmap图片
               ImageButton imageButton=(ImageButton)findViewById(R.id.imageButton);
               imageButton.setImageBitmap(bm);
           }catch (IOException e) {
               Log.e(TAG,e.toString());
           }
       }
   }
}
