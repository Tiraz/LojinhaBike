package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterViewPageBikes extends FragmentStateAdapter {
    public AdapterViewPageBikes(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new BikesNovasFragment();
            case 1:
                return new BikesUsadasFragment();
            case 2:
                return new BikesDoacaoFragment();
            default:
                return new BikesNovasFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
