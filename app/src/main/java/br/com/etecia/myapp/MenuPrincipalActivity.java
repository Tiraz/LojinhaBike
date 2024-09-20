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

public class MenuPrincipalActivity extends AppCompatActivity {
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

        menuBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BikeActivity.class));
                finish();
            }
        });
        menuAcessorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AcessoriosActivity.class));
                finish();
            }
        });
        menuManutencao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ManutencaoActivity.class));
                finish();
            }
        });
        menuDica.setOnClickListener();


    }
}