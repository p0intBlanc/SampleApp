package com.example.shreyas.firebasetest.itemsList;

import com.example.shreyas.firebasetest.BaseView;

/**
 * Created by fcss17862 on 24/03/17.
 */

public class ItemListContract {

    public interface View extends BaseView {

        void showItemsList();
        void updateItemsList();

    }


    public interface ItemsListPresenter{
        void fetchItems();
    }
}
