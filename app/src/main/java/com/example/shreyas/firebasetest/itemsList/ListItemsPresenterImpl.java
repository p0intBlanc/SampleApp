package com.example.shreyas.firebasetest.itemsList;

import android.util.Log;

import com.example.shreyas.firebasetest.Item;
import com.example.shreyas.firebasetest.RestApi;
import com.example.shreyas.firebasetest.itemsList.ItemListContract;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by fcss17862 on 24/03/17.
 */

public class ListItemsPresenterImpl implements ItemListContract.ItemsListPresenter {
    @Inject
    Retrofit retrofit;
    @Override
    public void fetchItems() {

        Call<List<Item>> getItems = retrofit.create(RestApi.class).getItems();
        getItems.enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                try {
                    Log.d("recieved response", response.body().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {
                Log.d("recieved error", t.getMessage());
            }
        });
    }
}
