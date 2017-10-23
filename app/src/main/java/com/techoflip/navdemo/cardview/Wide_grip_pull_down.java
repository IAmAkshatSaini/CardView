package com.techoflip.navdemo.cardview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Akshat on 02-09-2017.
 */

public class Wide_grip_pull_down extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myview=inflater.inflate(R.layout.wide_grip_lat_pulldown,container,false);
        return myview;
    }
}
