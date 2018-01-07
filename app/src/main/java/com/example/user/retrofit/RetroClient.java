package com.example.user.retrofit;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by User on 06/01/2018.
 */

public class RetroClient {
    private static final String ROOT_URL = "https://api.github.com";
    private static Retrofit getRetrofitInstance(){
        Retrofit rf = new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return rf;
    }
    public static ApiService getApiService(){
        ApiService api = getRetrofitInstance().create(ApiService.class);
        return api;
    }
}
