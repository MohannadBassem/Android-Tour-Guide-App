package com.example.tourguideappprototype4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TheAdapterOfPlace extends ArrayAdapter<Place> {

    TheAdapterOfPlace(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.theitems, parent, false);
        }

        Place RealTimePlace = getItem(position);

        TextView PlaceText = view.findViewById(R.id.PlaceName);
        PlaceText.setText(RealTimePlace.getPlaceName());

        TextView PlaceInfo = view.findViewById(R.id.PlaceDescription);
        PlaceInfo.setText(RealTimePlace.getPlaceInfo());

        ImageView PlaceImage = view.findViewById(R.id.PlacePhoto);

        if (RealTimePlace.hasImage()) {
            PlaceImage.setImageResource(RealTimePlace.getPlaceImage());
            PlaceImage.setVisibility(View.VISIBLE);
        } else {
            PlaceImage.setVisibility(View.GONE);
        }

        return view;
    }
}
