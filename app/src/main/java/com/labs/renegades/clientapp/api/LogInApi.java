package com.labs.renegades.clientapp.api;

import com.labs.renegades.clientapp.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by 1 on 29.05.2017.
 */

public interface LogInApi {
    @FormUrlEncoded
    @POST("/authorization/login/")
    Call<LoginResponse> logIn(@Field("username") String userName,
                              @Field("password") String password);
}
