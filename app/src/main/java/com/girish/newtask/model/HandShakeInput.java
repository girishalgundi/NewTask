package com.girish.newtask.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SiliconInfosys on 8/3/2016.
 */
public class HandShakeInput {

    @SerializedName("userName")
    private String userName;

    public HandShakeInput(String userName) {
        this.userName = userName;
    }
}
