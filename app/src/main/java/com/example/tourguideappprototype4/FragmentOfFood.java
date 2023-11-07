package com.example.tourguideappprototype4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentOfFood extends Fragment {

    public FragmentOfFood() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.thelists, container, false);

        ArrayList<Place> TheListOfFood = new ArrayList<>();
        TheListOfFood.add(new Place(R.string.Food1, R.string.McDonaldsInfo, R.drawable.mcdonaldsfood));
        TheListOfFood.add(new Place(R.string.Food2, R.string.kilokbabInfo, R.drawable.kilokbab));
        TheListOfFood.add(new Place(R.string.Food3, R.string.kfcInfo, R.drawable.kfcfood));

        TheAdapterOfPlace theAdapterOfPlace = new TheAdapterOfPlace(getActivity(), TheListOfFood);

        ListView listView = view.findViewById(R.id.TheListLayout);

        listView.setAdapter(theAdapterOfPlace);

        return view;
    }
}