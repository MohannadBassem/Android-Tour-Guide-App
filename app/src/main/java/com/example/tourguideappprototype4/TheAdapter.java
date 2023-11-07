package com.example.tourguideappprototype4;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TheAdapter extends FragmentPagerAdapter {


    private Context bContext;


    TheAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        bContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FragmentOfHotels();
        } else if (position == 1) {
            return new FragmentOfFood();
        } else if (position == 2) {
            return new FragmentOfHistorical();
        } else {
            return new FragmentOfMalls();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return bContext.getString(R.string.Hotels);
        } else if (position == 1) {
            return bContext.getString(R.string.FoodStreets);
        } else if (position == 2) {
            return bContext.getString(R.string.historicalPlaces);
        } else {
            return bContext.getString(R.string.ShoppingPlaces);
        }
    }
}