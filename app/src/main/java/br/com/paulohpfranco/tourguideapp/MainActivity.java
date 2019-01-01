package br.com.paulohpfranco.tourguideapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content viewer
        setContentView(R.layout.activity_main);

        // Ache o view pager que habilitará o usuário a deslizar entre fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Ache o layout da aba que mostra as abas
        TabLayout tabLayout = findViewById(R.id.tabs);

        PlacesFragmentAdapter adapter = new PlacesFragmentAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
