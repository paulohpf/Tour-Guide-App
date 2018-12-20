package br.com.paulohpfranco.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlaceAdapter extends FragmentPagerAdapter {

    private Context tgContext;

    public PlaceAdapter (Context context, FragmentManager fm) {
        super(fm);
        tgContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new VitoriaRegiaFragment();
        } else if (position == 1) {
            return new FiuFiuBatatasFragment();
        } else if (position == 2){
            return new PizzaFritaFragment();
        } else {
            return new CiaCaldinhoFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    public String[] getPageTitle() {
        String[] arrayTitle = {tgContext.getString(R.string.vitoriaregia_name), tgContext.getString(R.string.ffbatatas_name), tgContext.getString(R.string.pizzafrita_name), tgContext.getString(R.string.ciadocaldinho_name)};

        return arrayTitle;
    }
}
