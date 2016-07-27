package com.cetcnav.test.test.domain.http.api;


import com.cetcnav.test.test.domain.http.response.IDCardResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;


public interface IDCardApi {
    @GET("/apistore/idservice/id")
    Call<IDCardResponse> getId(
            @Header("apikey") String apiKey,
            @Query("id") String ID
    );
}
