package com.example.asus.hi;

/**
 * Created by ASUS on 2017/4/21.
 */

public class Province{
    private String name;
    private int imageId;
    public Province(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}