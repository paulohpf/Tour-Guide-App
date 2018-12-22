package br.com.paulohpfranco.tourguideapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NacoesUnidasActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ArrayList<Place> nacoesList = new ArrayList<Place>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content viewer
        setContentView(R.layout.drawer_layout);

        //Find the ViewPager who will enable switching page when user slide
        final ViewPager viewPager = findViewById(R.id.viewpager);

        nacoesList.add(new Place(R.string.vitoriaregia_name, R.string.vitoriaregia_description, R.drawable.vitoriaregia));
        nacoesList.add(new Place(R.string.ffbatatas_name, R.string.ffbatatas_description, R.drawable.ffbatatas));
        nacoesList.add(new Place(R.string.pizzafrita_name, R.string.pizzafrita_description, R.drawable.pizzafrita));
        nacoesList.add(new Place(R.string.ciadocaldinho_name, R.string.ciadocaldinho_description, R.drawable.ciadocaldinho));

        PlacesAdapter adapter = new PlacesAdapter(this, getSupportFragmentManager(), nacoesList);

        viewPager.setAdapter(adapter);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        mDrawerList = findViewById(R.id.left_drawer);

        mDrawerList.setAdapter(new ArrayAdapter<>(this, R.layout.list_item, adapter.getPageTitle()));
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                viewPager.setCurrentItem(position);
                mDrawerLayout.closeDrawers();
            }
        });
    }
}
