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

public class BoulevardShoppingActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ArrayList<Place> boulevardShoppingList = new ArrayList<Place>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content viewer
        setContentView(R.layout.drawer_layout);

        //Find the ViewPager who will enable switching page when user slide
        final ViewPager viewPager = findViewById(R.id.viewpager);

        boulevardShoppingList.add(new Place(R.string.burgerking_name, R.string.burgerking_description));
        boulevardShoppingList.add(new Place(R.string.mcdonalds_name, R.string.mcdonalds_description));

        PlacesAdapter adapter = new PlacesAdapter(this, getSupportFragmentManager(), boulevardShoppingList);

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
