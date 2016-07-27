package com.cetcnav.test.test.domain.http.api;


import com.cetcnav.test.test.domain.contast.UrlUtil;
import com.cetcnav.test.test.domain.http.request.IDCardRequest;
import com.cetcnav.test.test.domain.http.response.IDCardResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class IDCardClient {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(UrlUtil.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    IDCardApi idCardApi = retrofit.create(IDCardApi.class);

    public Call<IDCardResponse> getId(IDCardRequest idCardRequest) {
        Call<IDCardResponse> call = idCardApi.getId(idCardRequest.getApiKey(), idCardRequest.getID());
        return call;
    }
}
