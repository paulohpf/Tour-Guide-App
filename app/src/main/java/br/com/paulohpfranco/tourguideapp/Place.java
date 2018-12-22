package br.com.paulohpfranco.tourguideapp;

import java.util.ArrayList;

public class Place extends ArrayList<String> {

    /** Place Name */
    private int mPlaceName;

    /** Place Description */
    private int mPlaceDescription;

    /** Image resource ID for Place*/
    private int mPlaceImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create new Place Object without Image
     *
     * @param placeName is the place name
     *
     * @param placeDescription is the place description
     */
    public Place(int placeName, int placeDescription) {
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
    }

    /**
     * Create new Place Object with Image
     *
     * @param placeName is the place name
     *
     * @param placeDescription the place description
     *
     * @param placeImageResourceId is the place image
     */
    public Place(int placeName, int placeDescription, int placeImageResourceId) {
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
        mPlaceImageResourceId = placeImageResourceId;
    }

    public int getmPlaceDescription() {
        return mPlaceDescription;
    }

    public int getmPlaceImageResourceId() {
        return mPlaceImageResourceId;
    }

    public int getmPlaceName() {
        return mPlaceName;
    }

    public boolean hasImage() {
        return mPlaceImageResourceId != NO_IMAGE_PROVIDED;
    }
}
