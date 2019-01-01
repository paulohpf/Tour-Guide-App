package br.com.paulohpfranco.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceActivity extends AppCompatActivity {

    private Integer mPlaceImage;
    private Integer mPlaceName;
    private Integer mPlaceDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content viewer
        setContentView(R.layout.activity_place);

        mPlaceImage = (Integer) getIntent().getSerializableExtra("Place Image");
        mPlaceName = (Integer) getIntent().getSerializableExtra("Place Name");
        mPlaceDescription = (Integer) getIntent().getSerializableExtra("Place Description");


        ImageView imageViewPlaceImage = findViewById(R.id.placeImage);
        if(mPlaceImage != -1){
            // If an image is available, display the provided image based on the resource ID
            imageViewPlaceImage.setImageResource(mPlaceImage);
            // Make sure the view is visible
            imageViewPlaceImage.setVisibility(View.VISIBLE);
        } else {
            imageViewPlaceImage.setVisibility(View.GONE);
        }

        TextView textViewPlaceName = findViewById(R.id.placeName);
        textViewPlaceName.setText(getApplicationContext().getString(mPlaceName));

        TextView textViewPlaceDescription = findViewById(R.id.placeDescription);
        textViewPlaceDescription.setText(getApplicationContext().getString(mPlaceDescription));
    }
}
