package com.labs.renegades.clientapp.api;

import com.labs.renegades.clientapp.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by 1 on 29.05.2017.
 */

public interface GetUsersApi {
    @GET("/authorization/allUsers")
    Call<List<Model>> getUsers();
}
