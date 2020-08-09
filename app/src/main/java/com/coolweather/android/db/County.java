package com.coolweather.android.db;

/**
 * Created by HP on 2020/8/9.
 */

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    private int id;     //id是每个实体都应该有的字段
    private String countyName;  //县的名字
    private String weatherId;  //天气id
    private int cityId;      //所属城市

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
}
