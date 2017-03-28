package com.example.shreyas.firebasetest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by fcss17862 on 24/03/17.
 */

public interface RestApi {

    @GET("posts")
    Call<List<Item>> getItems();
}
