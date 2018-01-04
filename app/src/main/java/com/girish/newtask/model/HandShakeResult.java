package com.girish.newtask.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SiliconInfosys on 8/3/2016.
 */
public class HandShakeResult {

    @SerializedName("Modules")
    private String Modules;
    @SerializedName("Exponent")
    private String Exponent;
    @SerializedName("VersionCode")
    private String VersionCode;

    @SerializedName("DownloadLink")
    private String DownloadLink;

    @SerializedName("Remark")
    private String Remark;

    public String getModules() {
        return Modules;
    }

    public String getExponent() {
        return Exponent;
    }

    public String getVersionCode() {
        return VersionCode;
    }

    public String getDownloadLink() {
        return DownloadLink;
    }

    public String getRemark() {
        return Remark;
    }

}

