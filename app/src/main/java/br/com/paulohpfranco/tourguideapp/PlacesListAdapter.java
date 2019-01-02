package br.com.paulohpfranco.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesListAdapter extends ArrayAdapter<Place> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    public PlacesListAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.imageViewListItem);
        // Check if an image is provided for this word or not
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getmPlaceImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID textViewListItem.
        TextView textViewListItem = listItemView.findViewById(R.id.textViewListItem);
        textViewListItem.setText(currentPlace.getmPlaceName());

        // Set the theme color for the list item
        View placesListLinearLayout = listItemView.findViewById(R.id.placesListLinearLayout);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        placesListLinearLayout.setBackgroundColor(color);

        return listItemView;
    }
}
