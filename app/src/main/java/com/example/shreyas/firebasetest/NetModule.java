package com.example.shreyas.firebasetest;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fcss17862 on 24/03/17.
 */

@Module
public class NetModule {

    String mBaseUrl;

    public NetModule(String baseUrl) {
        this.mBaseUrl = baseUrl;
    }

    @Provides
    @Singleton
    public Cache getCache(Application application) {
        int cacheSize = 10 * 1024 * 1024;
        Cache cache = new Cache(application.getCacheDir(), cacheSize);
        return cache;
    }

    @Singleton
    @Provides
    public OkHttpClient getOkHttpClient(Cache cache) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.cache(cache);

        return builder.build();
    }


    @Singleton
    @Provides
    public Gson getGson() {
        GsonBuilder builder = new GsonBuilder();
        return builder.create();
    }


    @Singleton
    @Provides
    public Retrofit getRetrofit(OkHttpClient client, Gson gson) {
        Retrofit retrofit = new Retrofit.Builder().client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(mBaseUrl).build();
        return retrofit;
    }
}
