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
public class GetulioVargasFragment extends Fragment {

    private ArrayList<Place> getulioList = new ArrayList<Place>();

    public GetulioVargasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        getulioList.clear();

        getulioList.add(new Place(R.string.estanciagrill_name, R.string.estanciagrill_description));
        getulioList.add(new Place(R.string.acaidabarra_name, R.string.acaidabarra_description));

        ListView listView = rootView.findViewById(R.id.placesListView);

        PlacesListAdapter adapter = new PlacesListAdapter(getActivity(), getulioList, R.color.category_getuliovargas);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place place = getulioList.get(position);

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