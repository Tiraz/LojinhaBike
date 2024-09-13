package br.com.etecia.myapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    MaterialButton btnRecuperarSenhaLogin,btnCadastrarLogin,btnEntrar;
    ImageView imgLogo;
    TextInputEditText txtUsuarioLogin, txtSenhaLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnRecuperarSenhaLogin = findViewById(R.id.btnRcuperarSenhaLogin);
        btnCadastrarLogin = findViewById(R.id.btnCadastrarLogin);
        btnEntrar = findViewById(R.id.btnEntrar);

        imgLogo = findViewById(R.id.imgLogo);

        txtSenhaLogin = findViewById(R.id.txtSenhaLogin);
        txtUsuarioLogin = findViewById(R.id.txtUsarioLogin);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String entSenha, entUsuario;

                entUsuario = txtUsuarioLogin.getText().toString().trim();
                entSenha = txtSenhaLogin.getText().toString().trim();

                if(entUsuario.equals("etecia") && entSenha.equals("etecia")){
                    startActivity(new Intent(getApplicationContext(),MenuPrincipalActivity.class));
                    finish();
                }
                else {
                    Toast.makeText().show();

                }
            }
        });

        btnCadastrarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CadastrarSenhaActivity.class));
                finish();

            }
        });

        btnRecuperarSenhaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RecuperarSenhaActivity.class));
                finish();
            }
        });
    }
}