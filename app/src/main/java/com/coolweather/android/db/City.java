package com.coolweather.android.db;

/**
 * Created by HP on 2020/8/9.
 */

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;     //id是每个实体都应该有的字段
    private String cityName;  //城市的名字
    private int cityCode;  //城市的代号
    private int provinceId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}

