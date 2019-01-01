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
public class NacoesUnidasFragment extends Fragment {

    private ArrayList<Place> nacoesList = new ArrayList<Place>();

    public NacoesUnidasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        nacoesList.clear();

        nacoesList.add(new Place(R.string.vitoriaregia_name, R.string.vitoriaregia_description, R.drawable.vitoriaregia));
        nacoesList.add(new Place(R.string.ffbatatas_name, R.string.ffbatatas_description, R.drawable.ffbatatas));
        nacoesList.add(new Place(R.string.pizzafrita_name, R.string.pizzafrita_description, R.drawable.pizzafrita));
        nacoesList.add(new Place(R.string.ciadocaldinho_name, R.string.ciadocaldinho_description, R.drawable.ciadocaldinho));

        ListView listView = rootView.findViewById(R.id.placesListView);

        PlacesListAdapter adapter = new PlacesListAdapter(getActivity(), nacoesList, R.color.category_nacoesunidas);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place place = nacoesList.get(position);

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
