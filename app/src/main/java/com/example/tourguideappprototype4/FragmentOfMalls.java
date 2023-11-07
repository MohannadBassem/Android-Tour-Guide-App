package com.example.tourguideappprototype4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentOfMalls extends Fragment {


    public FragmentOfMalls() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.thelists, container, false);

        ArrayList<Place> TheListOfMalls = new ArrayList<>();
        TheListOfMalls.add(new Place(R.string.Mall1, R.string.cfcMallInfo, R.drawable.cfcshopping));
        TheListOfMalls.add(new Place(R.string.Mall2, R.string.mallOfEgyptInfo, R.drawable.mallofegyptshopping));
        TheListOfMalls.add(new Place(R.string.Mall3, R.string.cityCentreMallInfo, R.drawable.citycentremallshopping));

        TheAdapterOfPlace theAdapterOfPlace = new TheAdapterOfPlace(getActivity(), TheListOfMalls);

        ListView listView = view.findViewById(R.id.TheListLayout);

        listView.setAdapter(theAdapterOfPlace);

        return view;
    }
}