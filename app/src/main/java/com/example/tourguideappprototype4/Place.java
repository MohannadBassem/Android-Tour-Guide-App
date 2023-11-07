package com.example.tourguideappprototype4;

public class Place {
    private static final int NO_IMAGE_PROVIDED = -1;
    private int placeName;
    private int PlaceInfo;
    private int placeImage = NO_IMAGE_PROVIDED;

    Place(int nameOfPlace, int InfoOfPlace, int imageOfPlace) {
        this.placeName = nameOfPlace;
        this.PlaceInfo = InfoOfPlace;
        this.placeImage = imageOfPlace;
    }

    int getPlaceName() {
        return placeName;
    }

    int getPlaceInfo() {
        return PlaceInfo;
    }

    int getPlaceImage() {
        return placeImage;
    }

    boolean hasImage() {
        return placeImage != NO_IMAGE_PROVIDED;
    }
}

