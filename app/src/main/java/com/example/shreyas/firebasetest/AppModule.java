package com.example.shreyas.firebasetest;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fcss17862 on 24/03/17.
 */

@Module
public class AppModule  {
    Application mApplication;

    public AppModule(Application app){
        mApplication = app;
    }

    @Provides
    @Singleton
    public  Application getInstance(){
        return mApplication;
    }
}
