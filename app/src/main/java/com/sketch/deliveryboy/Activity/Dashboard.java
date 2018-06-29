package com.sketch.deliveryboy.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.sketch.deliveryboy.Fragment.Accepted;

import com.sketch.deliveryboy.Fragment.All;
import com.sketch.deliveryboy.Fragment.Viewed;
import com.sketch.deliveryboy.R;

/**
 * Created by developer on 27/6/18.
 */

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
ImageView profileImg;
    DrawerLayout drawer;
    TextView menu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //drawer = findViewById(R.id.drawer_layout);

      // menu=findViewById(R.id.menu);
        TabLayout tabLayout =  findViewById(R.id.tab_layout);
        ViewPager viewPager =  findViewById(R.id.pager);
        drawer=findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        drawer.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });
        viewPager.setAdapter(new SectionPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabTextColors(
                ContextCompat.getColor(getApplicationContext(), R.color.grey),
                ContextCompat.getColor(getApplicationContext(), R.color.track_blue)
        );
        //profileImg=findViewById(R.id.profile_img);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer,  R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    public class SectionPagerAdapter extends FragmentPagerAdapter {

        public SectionPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new All();
                case 1:
                    return new Viewed();
                case 2:
                    return new Accepted();


                default:
                    return new All();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "All";
                case 1:
                    return "Viewed";
                case 2:
                    return "Accepted";
                default:
                    return "All";
            }
        }
    }

}