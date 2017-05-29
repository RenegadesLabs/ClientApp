package com.labs.renegades.clientapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by 1 on 29.05.2017.
 */

public class LoginResponse {

    @SerializedName("code")
    @Expose
    private int code;

    @SerializedName("token")
    @Expose
    private String token;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
