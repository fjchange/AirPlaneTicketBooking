package com.example.asus.hi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.asus.hi.Province;
import com.example.asus.hi.R;

import java.util.List;

/**
 * Created by ASUS on 2017/4/21.
 */

public class ProvinceAdapter extends ArrayAdapter<Province> {
    private int resourceId;
    public ProvinceAdapter(Context context, int textViewResourceId, List<Province> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Province province=getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.provinceImage=(ImageView)view.findViewById(R.id.province_image);
            viewHolder.provinceName=(TextView)view.findViewById(R.id.province_name);
            view.setTag(viewHolder);
        }
        else{
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.provinceImage.setImageResource(province.getImageId());
        viewHolder.provinceName.setText(province.getName());
        return view;
    }
    class ViewHolder{
        ImageView provinceImage;
        TextView provinceName;
    }
}