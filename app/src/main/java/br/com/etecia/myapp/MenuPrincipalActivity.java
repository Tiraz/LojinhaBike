package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {

    CardView menuBike, menuManutencao, menuAcessorio, menuDica, menuLocais, menuEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu_principal_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        menuBike = findViewById(R.id.menuBike);
        menuAcessorio = findViewById(R.id.menuAcessorio);
        menuManutencao = findViewById(R.id.menuManutencao);
        menuDica = findViewById(R.id.menuDicas);
        menuLocais = findViewById(R.id.menuLocais);
        menuEventos = findViewById(R.id.menuEventos);


        menuBike.setOnClickListener(this);
        menuAcessorio.setOnClickListener(this);
        menuManutencao.setOnClickListener(this);
        menuDica.setOnClickListener(this);
        menuLocais.setOnClickListener(this);
        menuEventos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.menuBike) {
            startActivity(new Intent(getApplicationContext(), BikeActivity.class));
            finish();
        }
        if (v.getId() == R.id.menuAcessorio) {
            startActivity(new Intent(getApplicationContext(), AcessoriosActivity.class));
            finish();
        }
        if (v.getId() == R.id.menuManutencao) {
            startActivity(new Intent(getApplicationContext(), ManutencaoActivity.class));
            finish();
        }
        if (v.getId() == R.id.menuDicas) {
            startActivity(new Intent(getApplicationContext(), DicasActivity.class));
            finish();
        }
        if (v.getId() == R.id.menuLocais) {
            startActivity(new Intent(getApplicationContext(), LocaisActivity.class));
            finish();
        }
        if (v.getId() == R.id.menuEventos) {
            startActivity(new Intent(getApplicationContext(), LocaisActivity.class));
            finish();
        }
    }
}