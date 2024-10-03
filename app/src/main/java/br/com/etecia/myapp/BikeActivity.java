package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

public class BikeActivity extends AppCompatActivity {
    TabLayout idTabLayoutBikes;
    ViewPager2 idViewPagerBike;
    AdapterViewPageBikes adapterViewPageBikes;
    MaterialToolbar voltarMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.bike_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        idTabLayoutBikes = findViewById(R.id.idTabLayoutBikes);
        idViewPagerBike = findViewById(R.id.idViewPagerBike);


        adapterViewPageBikes = new AdapterViewPageBikes(this);


        idViewPagerBike.setAdapter(adapterViewPageBikes);

        idTabLayoutBikes.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                idViewPagerBike.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        idViewPagerBike.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                idTabLayoutBikes.getTabAt(position);
            }
        });

        voltarMenu = findViewById(R.id.idRetornarMenuBike);
        voltarMenu.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MenuPrincipalActivity.class));
                finish();
            }
        });
    }
}