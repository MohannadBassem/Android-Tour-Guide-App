package com.example.tourguideappprototype4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        getSupportActionBar();


        ViewPager viewPager = findViewById(R.id.TheViewPager);

        TheAdapter theAdapter = new TheAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(theAdapter);


        TabLayout tabLayout = findViewById(R.id.TheMainTab);

        tabLayout.setupWithViewPager(viewPager);
    }
}
