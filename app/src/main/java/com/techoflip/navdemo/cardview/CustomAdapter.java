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

public class CustomAdapter  extends BaseAdapter {
    String name[];
    int images[];
    MainActivity mainActivity;
    LayoutInflater layoutInflater=null;
    public CustomAdapter(MainActivity mainActivity,String name[],int images[]) {
        this.images=images;
        this.name=name;
        this.mainActivity=mainActivity;
        layoutInflater=(LayoutInflater)mainActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {


        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return images.length;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowview=layoutInflater.inflate(R.layout.listview,null);
        TextView textView=(TextView)rowview.findViewById(R.id.textView2);
        textView.setText(name[i]);
        ImageView imageView=(ImageView) rowview.findViewById(R.id.imageView2);
        imageView.setImageResource(images[i]);

        return rowview;
    }
}
