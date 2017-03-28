package com.example.shreyas.firebasetest;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.example.shreyas.firebasetest.itemsList.ListsFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by fcss17862 on 24/03/17.
 */

@Singleton
@Component(modules = {AppModule.class,NetModule.class})
public interface NetComponet {

    void inject(MainActivity activity);
    void inject(ListsFragment fragment);
}
