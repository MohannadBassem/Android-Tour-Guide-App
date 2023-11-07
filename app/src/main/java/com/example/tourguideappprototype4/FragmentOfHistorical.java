package com.example.tourguideappprototype4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FragmentOfHistorical extends Fragment {


    public FragmentOfHistorical() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.thelists, container, false);

        ArrayList<Place> TheListOfHistorical = new ArrayList<>();
        TheListOfHistorical.add(new Place(R.string.HistoricalPlace1, R.string.pyramidshistoricalInfo, R.drawable.pyramidshistorical));
        TheListOfHistorical.add(new Place(R.string.HistoricalPlace2, R.string.karnaktemplehistoricalInfo, R.drawable.karnaktemplehistorical));
        TheListOfHistorical.add(new Place(R.string.HistoricalPlace3, R.string.abusimbelhistorical, R.drawable.abusimbelhistorical));

        TheAdapterOfPlace theAdapterOfPlace = new TheAdapterOfPlace(getActivity(), TheListOfHistorical);

        ListView listView = view.findViewById(R.id.TheListLayout);

        listView.setAdapter(theAdapterOfPlace);

        return view;
    }
}