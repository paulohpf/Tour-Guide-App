package br.com.paulohpfranco.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FiuFiuBatatasFragment extends Fragment {


    public FiuFiuBatatasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_fragment, container, false);

        ImageView imageViewPlaceImage = rootView.findViewById(R.id.placeImage);
        imageViewPlaceImage.setImageResource(R.drawable.ffbatatas);
        imageViewPlaceImage.setVisibility(View.VISIBLE);

        TextView textViewPlaceName = rootView.findViewById(R.id.placeName);
        textViewPlaceName.setText(R.string.ffbatatas_name);

        TextView textViewPlaceDescription = rootView.findViewById(R.id.placeDescription);
        textViewPlaceDescription.setText(R.string.ffbatatas_description);

        return rootView;
    }

}
