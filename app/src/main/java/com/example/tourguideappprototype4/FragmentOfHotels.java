package com.example.tourguideappprototype4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FragmentOfHotels extends Fragment {


    public FragmentOfHotels() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.thelists, container, false);

        ArrayList<Place> TheListOfHotelS = new ArrayList<>();
        TheListOfHotelS.add(new Place(R.string.Hotel1, R.string.SteigenBergerInfo, R.drawable.steigenbergerhotel));
        TheListOfHotelS.add(new Place(R.string.Hotel2, R.string.HiltonInfo, R.drawable.hiltonhotel));
        TheListOfHotelS.add(new Place(R.string.Hotel3, R.string.FourSeasonInfo, R.drawable.fourseasonnileplazahotel));

        TheAdapterOfPlace theAdapterOfPlace = new TheAdapterOfPlace(getActivity(), TheListOfHotelS);

        ListView listView = view.findViewById(R.id.TheListLayout);

        listView.setAdapter(theAdapterOfPlace);

        return view;
    }
}