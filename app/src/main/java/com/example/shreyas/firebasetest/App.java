package com.example.shreyas.firebasetest;

import android.app.Application;

/**
 * Created by fcss17862 on 24/03/17.
 */

public class App extends Application {
    private NetComponet netComponet;


    @Override
    public void onCreate() {
        super.onCreate();
        netComponet = DaggerNetComponet.builder().appModule(new AppModule(this))
                .netModule(new NetModule("https://jsonplaceholder.typicode.com/")).build();
    }


    public NetComponet getNetComponent() {
        return netComponet;
    }
}
