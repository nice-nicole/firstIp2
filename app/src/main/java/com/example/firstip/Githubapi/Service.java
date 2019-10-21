package com.example.firstip.Githubapi;

import com.example.firstip.network.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service{
    @GET("/search/users?q=location:bujumbura")
    Call<ItemResponse>getItems();
        }