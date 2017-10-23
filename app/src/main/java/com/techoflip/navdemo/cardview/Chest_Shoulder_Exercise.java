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

import android.view.View;

public class Chest_Shoulder_Exercise extends AppCompatActivity {

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
        setContentView(R.layout.activity_chest_shoulder);

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
                        PushUps p1=new PushUps();
                        return p1;
                    case 1:
                        Flat_Bench_Press p2=new Flat_Bench_Press();
                        return p2;
                    case 2:
                        Incline_Bench_Press p3=new Incline_Bench_Press();
                        return p3;
                    case 3:
                        Db_Front_Raise p4=new Db_Front_Raise();
                        return p4;
                    case 4:
                        DB_Side_Raise p5=new DB_Side_Raise();
                        return p5;
                    case 5:
                        DBShoulder_Press p6=new DBShoulder_Press();
                        return p6;
                    default:
                        return null;
                }
            }

            @Override
            public int getCount() {
                // Show 3 total pages.
                return 6;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return "Push Ups";
                    case 1:
                        return "Decline Bench Press";
                    case 2:
                        return "Incline Bench Press";
                    case 3:
                        return "DB Front Raise";
                    case 4:
                        return "DB Side Raise";
                    case 5:
                        return "DB Shoulder Press";






                }
                return null;
            }
        }
    }
