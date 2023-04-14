package com.example.mytwiter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class NameListAdapter extends BaseAdapter {

    String name[];

    int image[];


    public NameListAdapter (String[]name,int[]images) {
        this.name = name;
        this.image = images;
    }




        @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       ;
        return null;
    }
}
