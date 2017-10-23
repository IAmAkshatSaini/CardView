package com.techoflip.navdemo.cardview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Akshat on 28-08-2017.
 */

public class Exercise extends BaseAdapter {
    String[] amin;
    String[] name;
     SecondActivity secondActivity;
    LayoutInflater layoutInflater=null;
    public Exercise(SecondActivity secondActivity, String[] amen, String[] name) {
        this.amin = amen;
        this.name=name;


        this.secondActivity=secondActivity;
        layoutInflater=(LayoutInflater)secondActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }




    @Override
    public int getCount() {
        return amin.length;

    }


    @Override
    public Object getItem(int i) {
        return 0;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View review=layoutInflater.inflate(R.layout.second_list,null);
        TextView textView=(TextView)review.findViewById(R.id.textView3);
        textView.setText(amin[i]);
        TextView textview1=(TextView)review.findViewById(R.id.textView5);
        textview1.setText(name[i]);
        if (i==0){
            review.setBackground(review.getResources().getDrawable(R.drawable.fifth));
        }else if(i==1)
        {
            review.setBackground(review.getResources().getDrawable(R.drawable.second));
        }else if(i==2)
        {
            review.setBackground(review.getResources().getDrawable(R.drawable.first));
        }else if(i==3)
        {
            review.setBackground(review.getResources().getDrawable(R.drawable.fourth));
        }else if(i==4)
        {
            review.setBackground(review.getResources().getDrawable(R.drawable.sixth));
        }
        else if(i==5)
        {
            review.setBackground(review.getResources().getDrawable(R.drawable.seventh1));
        }
        else if(i==6)
        {
            review.setBackground(review.getResources().getDrawable(R.drawable.fifth));
        }
        return review;
    }
}
