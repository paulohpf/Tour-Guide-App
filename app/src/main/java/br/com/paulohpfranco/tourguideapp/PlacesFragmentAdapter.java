package br.com.paulohpfranco.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlacesFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public PlacesFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new BauruShoppingFragment();
        }else if(position == 1){
            return new BoulevardShoppingFragment();
        }else if(position == 2){
            return new NacoesUnidasFragment();
        } else {
            return new GetulioVargasFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return mContext.getString(R.string.bauru_shopping);
        } else if (position == 1) {
            return mContext.getString(R.string.bauru_boulevard_shopping);
        } else if (position == 2) {
            return mContext.getString(R.string.bauru_nacoes_unidas);
        } else {
            return mContext.getString(R.string.bauru_getulio_vargas);
        }
    }
}
