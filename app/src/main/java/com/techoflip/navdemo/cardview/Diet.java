package com.techoflip.navdemo.cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Akshat on 28-08-2017.
 */

public class Diet extends BaseAdapter {
    String[] amen;
     SecondActivity secondActivity;
    LayoutInflater layoutInflater=null;
    public Diet(SecondActivity secondActivity, String[] amen) {
        this.amen = amen;


        this.secondActivity=secondActivity;
        layoutInflater=(LayoutInflater)secondActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }




    @Override
    public int getCount() {
        return amen.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View review=layoutInflater.inflate(R.layout.second_list,null);
        TextView textView=(TextView)review.findViewById(R.id.textView3);
        textView.setText(amen[i]);
        return review;
    }
}
