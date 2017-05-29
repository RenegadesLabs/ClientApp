package com.labs.renegades.clientapp.api;

import com.labs.renegades.clientapp.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by 1 on 29.05.2017.
 */

public interface RegisterApi {
    @FormUrlEncoded
    @POST("/authorization/registration/")
    Call<LoginResponse> register(@Field("username") String userName,
                                 @Field("password") String password, @Field("email") String email);
}
