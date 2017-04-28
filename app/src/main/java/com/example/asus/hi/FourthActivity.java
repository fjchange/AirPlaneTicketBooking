package com.example.asus.hi;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;



public class FourthActivity extends AppCompatActivity {
    private String[]data={
            "北京市","天津市","上海市","重庆市","河北省","山西省","辽宁省","吉林省","黑龙江省","江苏省",
    "浙江省","安徽省","福建省","江西省","山东省","河南省","湖北省","湖南省","广东省","海南省","四川省",
    "贵州省","云南省","陕西省","甘肃省","青海省","台湾省","内蒙古自治区","广西壮族自治区","西藏自治区",
    "宁夏回族自治区","新疆维吾尔自治区","香港特别行政区","澳门特别行政区"
    };
    private List<Province> provinceList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        intiProvinces();
        ProvinceAdapter provinceAdapter=new ProvinceAdapter(FourthActivity.this,R.layout.province_item,provinceList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(provinceAdapter);
        
    }
    private void intiProvinces(){
            Province bj=new Province(data[0],R.drawable.p_1);
            provinceList.add(bj);
            Province tj=new Province(data[1],R.drawable.p_2);
            provinceList.add(tj);
            Province sh=new Province(data[2],R.drawable.p_3);
            provinceList.add(sh);
            Province cq=new Province(data[3],R.drawable.p_4);
            provinceList.add(cq);
            Province hb=new Province(data[4],R.drawable.p_5);
            provinceList.add(hb);
            Province sx=new Province(data[5],R.drawable.p_6);
            provinceList.add(sx);
            Province ln=new Province(data[6],R.drawable.p_7);
            provinceList.add(ln);
            Province jl=new Province(data[7],R.drawable.p_8);
            provinceList.add(jl);
            Province hlj=new Province(data[8],R.drawable.p_9);
            provinceList.add(hlj);
            Province js=new Province(data[9],R.drawable.p_10);
            provinceList.add(js);
            Province zj=new Province(data[10],R.drawable.p_11);
            provinceList.add(zj);
            Province ah=new Province(data[11],R.drawable.p_12);
            provinceList.add(ah);
            Province fj=new Province(data[12],R.drawable.p_13);
            provinceList.add(fj);
            Province jx=new Province(data[13],R.drawable.p_14);
            provinceList.add(jx);
            Province sd=new Province(data[14],R.drawable.p_15);
            provinceList.add(sd);
            Province hn=new Province(data[15],R.drawable.p_16);
            provinceList.add(hn);
            Province hub=new Province(data[16],R.drawable.p_17);
            provinceList.add(hub);
            Province hun=new Province(data[17],R.drawable.p_35);
            provinceList.add(hun);
            Province gd=new Province(data[18],R.drawable.p_18);
            provinceList.add(gd);
            Province hain=new Province(data[19],R.drawable.p_19);
            provinceList.add(hain);
            Province sc=new Province(data[20],R.drawable.p_20);
            provinceList.add(sc);
            Province gz=new Province(data[21],R.drawable.p_21);
            provinceList.add(gz);
            Province yn=new Province(data[22],R.drawable.p_22);
            provinceList.add(yn);
            Province shx=new Province(data[23],R.drawable.p_23);
            provinceList.add(shx);
            Province gs=new Province(data[24],R.drawable.p_24);
            provinceList.add(gs);
            Province qh=new Province(data[25],R.drawable.p_25);
            provinceList.add(qh);
            Province tw=new Province(data[26],R.drawable.p_26);
            provinceList.add(tw);
            Province nmg=new Province(data[27],R.drawable.p_27);
            provinceList.add(nmg);
            Province gx=new Province(data[28],R.drawable.p_28);
            provinceList.add(gx);
            Province xz=new Province(data[29],R.drawable.p_29);
            provinceList.add(xz);
            Province nx=new Province(data[30],R.drawable.p_30);
            provinceList.add(nx);
            Province xj=new Province(data[31],R.drawable.p_31);
            provinceList.add(xj);
    }
}
