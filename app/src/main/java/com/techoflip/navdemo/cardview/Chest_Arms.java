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

public class Chest_Arms extends AppCompatActivity {

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
        setContentView(R.layout.activity_chest_);

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

                    Flat_Bench_Press p1=new Flat_Bench_Press();
                    return p1;
                case 1:
                    Incline_Db_press p2=new Incline_Db_press();
                    return p2;
                case 2:
                    Dip_chest p3=new Dip_chest();
                    return p3;
                case 3:
                     Preacher_curl p4=new Preacher_curl();
                    return p4;

                case 4:
                    Db_kickback p6=new Db_kickback();
                    return p6;
                case 5:
                    DB_Side_Raise p7=new DB_Side_Raise();
                    return p7;
                case 6:
                    Db_Front_Raise p8=new Db_Front_Raise();
                    return p8;
                case 7:
                    Triceps_pushdown p9=new Triceps_pushdown();
                    return p9;
                case 8:
                    Hammer_curl p10= new Hammer_curl();
                    return p10;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 9;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Barbell Bench Press";
                case 1:
                    return "Incline DB Flyes";
                case 2:
                    return "Dips - Chest Version";
                case 3:
                    return "Barbell Bench Press";
                case 4:
                    return "Incline DB Flyes";
                case 5:
                    return "Dips - Chest Version";
                case 6:
                    return "Barbell Preacher Curl";
                case 7:
                    return "DB Kickback";
                case 8:
                    return "Hammer Curl";
                case 9:
                    return "Triceps Pushdown";
            }
            return null;
        }
    }
}
