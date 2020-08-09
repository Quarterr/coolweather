package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HP on 2020/8/9.
 */

public class Basic {
    @SerializedName("city")
    public String cityNmae;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }


}
