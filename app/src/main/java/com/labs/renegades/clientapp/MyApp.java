package com.labs.renegades.clientapp;

import android.app.Application;

import com.labs.renegades.clientapp.api.GetUsersApi;
import com.labs.renegades.clientapp.api.LogInApi;
import com.labs.renegades.clientapp.api.RegisterApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 1 on 29.05.2017.
 */

public class MyApp extends Application {
    private static LogInApi logInApi;
    private static RegisterApi registerApi;
    private static GetUsersApi getUsersApi;

    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("http://174.138.54.52/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        logInApi = retrofit.create(LogInApi.class);
        registerApi = retrofit.create(RegisterApi.class);
        getUsersApi = retrofit.create(GetUsersApi.class);
    }

    public static LogInApi getLogInApi() {
        return logInApi;
    }

    public static RegisterApi getRegisterApi() {
        return registerApi;
    }

    public static GetUsersApi getUsersApi() {
        return getUsersApi;
    }
}
