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

public class Legs_Abs1 extends AppCompatActivity {

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
        setContentView(R.layout.activity_legs__abs1);

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

                    Trade_Mill p1=new Trade_Mill();
                    return p1;
                case 1:
                    Barbell_Squats p2=new Barbell_Squats();
                    return p2;
                case 2:
                    Leg_Extension p3=new Leg_Extension();
                    return p3;
                case 3:
                    Leg_Curl p4=new Leg_Curl();
                    return p4;

                case 4:
                    Leg_press p6=new Leg_press();
                    return p6;
                case 5:
                    Seated_calf_Raise p7=new Seated_calf_Raise();
                    return p7;
                case 6:
                    Stability_Ball_Crunch p8=new Stability_Ball_Crunch();
                    return p8;
                case 7:
                    Spiderman_Crunch p9=new Spiderman_Crunch();
                    return p9;
                case 8:
                    Oblique_Crunch p10= new Oblique_Crunch();
                    return p10;
                case 9:
                    Plate_Twist p11= new Plate_Twist();
                    return p11;

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
                    return "Warm Up - Treadmill";
                case 1:
                    return " Barbell Squat";
                case 2:
                    return "Leg Extension";
                case 3:
                    return " Leg Curl";
                case 4:
                    return " Leg Press ";
                case 5:
                    return "Seated Calf Raise";
                case 6:
                    return "Stability Ball Crunch";
                case 7:
                    return " Spiderman Crunches";
                case 8:
                    return "Oblique Crunches";
                case 9:
                    return "Plate Twist";
            }
            return null;
        }
    }
}
