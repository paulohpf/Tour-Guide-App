package br.com.paulohpfranco.tourguideapp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PlacesAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private ArrayList<Place> mplaceList;

    public PlacesAdapter(Context context, FragmentManager fm, ArrayList<Place> placeList) {
        super(fm);
        mContext = context;
        mplaceList = placeList;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle data = new Bundle();
        data.putInt("place_name", mplaceList.get(position).getmPlaceName());
        data.putInt("place_description", mplaceList.get(position).getmPlaceDescription());
        data.putInt("place_image", mplaceList.get(position).getmPlaceImageResourceId());
        PlacesFragment placesFragment = new PlacesFragment();
        placesFragment.setArguments(data);
        return placesFragment;
    }

    @Override
    public int getCount() {
        return mplaceList.size();
    }

    @Nullable
    public ArrayList<String> getPageTitle() {
//        String[] arrayTitle = {mContext.getString(R.string.vitoriaregia_name), mContext.getString(R.string.ffbatatas_name), mContext.getString(R.string.pizzafrita_name), mContext.getString(R.string.ciadocaldinho_name)};
        ArrayList<String> arrayTitle = new ArrayList<>();

        for(int i = 0; i < getCount(); i++){
            arrayTitle.add(mContext.getString(mplaceList.get(i).getmPlaceName()));
        }

        return arrayTitle;
    }
}
