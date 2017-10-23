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

public class Arm_Back extends AppCompatActivity {

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
        setContentView(R.layout.activity_arm__back);

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
     * A placeholder fragment containing a simple view.
     */


        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */


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
                    Barbell_curl p1=new Barbell_curl();
                    return p1;
                case 1:
                    Hammer_curl p2=new Hammer_curl();
                    return p2;
                case 2:
                    Preacher_curl p3=new Preacher_curl();
                    return p3;
                case 3:
                    Db_kickback p4=new Db_kickback();
                    return p4;

                case 4:
                    Triceps_pushdown p6=new Triceps_pushdown();
                    return p6;
                case 5:
                    Bench_Dip p7=new Bench_Dip();
                    return p7;
                case 6:
                    Pull_Ups p8=new Pull_Ups();
                    return p8;
                case 7:
                    Wide_grip_pull_down p9=new Wide_grip_pull_down();
                return p9;
                case 8:
                Dumbell_row p10= new Dumbell_row();
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
                    return "Barbell Curl";
                case 1:
                    return "Hammer Curl";
                case 2:
                    return "Preacher Curl";
                case 3:
                    return "Db kickback";
                case 4:
                    return "Triceps pushdown";
                case 5:
                    return "Bench Dip";
                case 6:
                    return "Pull Ups";
                case 7:
                    return "Wide grip pull down";
                case 8:
                    return "Dumbell_row";
            }
            return null;
        }
    }
}
