package com.example.webs;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://simplifiedcoding.net/demos/";
//    String BASE_URL ="http://192.168.227.12/androidwebsite/ktra.php";
    @GET("marvel")
    Call<List<Results>> getsuperHeroes();
}
