package com.coolweather.android.db;
/**
 * Created by HP on 2020/8/9.
 */

import org.litepal.crud.DataSupport;
public class Province extends DataSupport {
    private int id;     //id是每个实体都应该有的字段
    private String provinceName;  //省的名字
    private int provinceCode;  //省的代号

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
