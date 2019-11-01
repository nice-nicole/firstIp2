package com.example.firstip.models;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {
    @GET("businesses/search")
    Call<YelpBusinessesSearchResponse> getNews(
            @Query("location") String location,
            @Query("term") String term
    );
}
