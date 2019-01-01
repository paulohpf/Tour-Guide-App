
package br.com.paulohpfranco.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BoulevardShoppingFragment extends Fragment {

    private ArrayList<Place> boulevardShoppingList = new ArrayList<Place>();

    public BoulevardShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        boulevardShoppingList.clear();

        boulevardShoppingList.add(new Place(R.string.burgerking_name, R.string.burgerking_description));
        boulevardShoppingList.add(new Place(R.string.mcdonalds_name, R.string.mcdonalds_description));

        ListView listView = rootView.findViewById(R.id.placesListView);

        PlacesListAdapter adapter = new PlacesListAdapter(getActivity(), boulevardShoppingList, R.color.category_boulevardshopping);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place place = boulevardShoppingList.get(position);

                Intent intent = new Intent(getContext(), PlaceActivity.class);

                intent.putExtra("Place Image", place.getmPlaceImageResourceId());
                intent.putExtra("Place Name", place.getmPlaceName());
                intent.putExtra("Place Description", place.getmPlaceDescription());

                startActivity(intent);
            }
        });

        return rootView;
    }
}
