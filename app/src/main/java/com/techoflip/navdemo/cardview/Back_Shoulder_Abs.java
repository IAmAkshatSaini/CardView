package com.techoflip.navdemo.cardview;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class Back_Shoulder_Abs extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back__shoulder__abs);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position){
                case 0:

                    Close_grip_lat_pulldown p1=new Close_grip_lat_pulldown();
                    return p1;
                case 1:
                    Seated_cable_row p2=new Seated_cable_row();
                    return p2;
                case 2:
                    Barbell_Shrug p3=new Barbell_Shrug();
                    return p3;
                case 3:
                    Hyper_Extension p4=new Hyper_Extension();
                    return p4;

                case 4:
                    Smith_press_behind_neck p6=new Smith_press_behind_neck();
                    return p6;
                case 5:
                    DB_Side_Raise p7=new DB_Side_Raise();
                    return p7;
                case 6:
                    Db_Front_Raise p8=new Db_Front_Raise();
                    return p8;
                case 7:
                    Decline_Crunches p9=new Decline_Crunches();
                    return p9;
                case 8:
                    Hanging_knee_raise p10= new Hanging_knee_raise();
                    return p10;
                case 9:
                    Cable_crunches p11= new Cable_crunches();
                    return p11;
                case 10:
                    Laying_Leg_Pull_in p12= new Laying_Leg_Pull_in();
                    return p12;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 10;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Close Grip Lat Pull Down";
                case 1:
                    return "Seated Cable Row ";
                case 2:
                    return "Barbell Shrugs";
                case 3:
                    return "Hyper Extension";
                case 4:
                    return "Smith Press Behind Neck";
                case 5:
                    return "DB Side Raise ";
                case 6:
                    return " DB Front Raise ";
                case 7:
                    return "Decline Crunches ";
                case 8:
                    return "Hanging Knee Raise";
                case 9:
                    return "Cable Crunches ";
                case 10:
                    return "Laying Leg Pull-In ";
            }
            return null;
        }
    }
}
