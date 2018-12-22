package br.com.paulohpfranco.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content viewer
        setContentView(R.layout.activity_main);

        TextView textViewNacoesUnidas = findViewById(R.id.main_nacoes);
        TextView textViewGetulioVargas = findViewById(R.id.main_getulio);
        TextView textViewBauruShopping = findViewById(R.id.main_bauru_shopping);
        TextView textViewBoulevardShopping = findViewById(R.id.main_boulevar);

        textViewNacoesUnidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NacoesUnidasActivity}
                Intent nacoesIntent = new Intent(MainActivity.this, NacoesUnidasActivity.class);

                // Start the new activity
                startActivity(nacoesIntent);
            }
        });

        textViewGetulioVargas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link GetulioVargasActivity}
                Intent getulioIntent = new Intent(MainActivity.this, GetulioVargasActivity.class);

                // Start the new activity
                startActivity(getulioIntent);
            }
        });

        textViewBauruShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link BauruShoppingActivity}
                Intent bauruShoppingIntent = new Intent(MainActivity.this, BauruShoppingActivity.class);

                // Start the new activity
                startActivity(bauruShoppingIntent);
            }
        });

        textViewBoulevardShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link BoulevardShoppingActivity}
                Intent boulevardShoppingIntent = new Intent(MainActivity.this, BoulevardShoppingActivity.class);

                // Start the new activity
                startActivity(boulevardShoppingIntent);
            }
        });

        /*//Find the ViewPager who will enable switching page when user slide
        final ViewPager viewPager = findViewById(R.id.viewpager);

        NacoesUnidasAdapter adapter = new NacoesUnidasAdapter(this, getSupportFragmentManager());

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
        });*/

    }
}
