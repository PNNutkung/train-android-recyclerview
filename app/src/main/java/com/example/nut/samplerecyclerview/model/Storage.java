package com.example.nut.samplerecyclerview.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nut on 9/6/2559.
 */
public class Storage {
    public static Storage storage;
    private List<ItemObject> list;
    private static final int[] icons = {
            android.R.drawable.ic_popup_reminder,
            android.R.drawable.ic_menu_add,
            android.R.drawable.ic_menu_delete
    };

    private Storage() {
        list = new ArrayList<ItemObject>();
        int random;
        for(int i = 1; i <= 1000; ++i) {
            random = (int)Math.floor(Math.random() * icons.length);
            list.add(new ItemObject( String.format("Item #%d", i), icons[random]) );
        }
    }

    public static Storage getInstance() {
        if(storage == null) {
            storage = new Storage();
        }
        return storage;
    }

    public List<ItemObject> getList() {
        return this.list;
    }


}
