package br.com.paulohpfranco.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {

    private int mPlaceName;
    private int mPlaceDescription;
    private int mPlaceImageResourceId;

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_fragment, container, false);

        mPlaceName = getArguments().getInt("place_name");
        mPlaceDescription = getArguments().getInt("place_description");
        mPlaceImageResourceId = getArguments().getInt("place_image");

        ImageView imageViewPlaceImage = rootView.findViewById(R.id.placeImage);
        if(mPlaceImageResourceId != -1){
            // If an image is available, display the provided image based on the resource ID
            imageViewPlaceImage.setImageResource(mPlaceImageResourceId);
            // Make sure the view is visible
            imageViewPlaceImage.setVisibility(View.VISIBLE);
        } else {
            imageViewPlaceImage.setVisibility(View.GONE);
        }

        TextView textViewPlaceName = rootView.findViewById(R.id.placeName);
        textViewPlaceName.setText(mPlaceName);

        TextView textViewPlaceDescription = rootView.findViewById(R.id.placeDescription);
        textViewPlaceDescription.setText(mPlaceDescription);

        return rootView;
    }
}
