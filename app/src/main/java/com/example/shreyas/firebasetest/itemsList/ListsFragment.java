package com.example.shreyas.firebasetest.itemsList;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shreyas.firebasetest.App;
import com.example.shreyas.firebasetest.Item;
import com.example.shreyas.firebasetest.MainActivity;
import com.example.shreyas.firebasetest.R;
import com.example.shreyas.firebasetest.RestApi;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by fcss17862 on 23/03/17.
 */

public class ListsFragment extends Fragment {




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //// TODO: 23/03/17  getItems

        View  root  = inflater.inflate(R.layout.fragment_list,container,false);
        ((App) getActivity().getApplication()).getNetComponent().inject(this);




        return root;
    }
}
