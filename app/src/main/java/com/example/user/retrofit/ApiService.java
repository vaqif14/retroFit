package com.example.user.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by User on 06/01/2018.
 */

public interface ApiService {
    @GET("search/users")
    Call<User> getGithubUser(@Query("q") String name);
}
