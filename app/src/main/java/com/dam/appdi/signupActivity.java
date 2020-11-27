package com.dam.appdi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signupActivity extends AppCompatActivity {

    private EditText txtUsuario;
    private EditText txtMail;
    private EditText txtContraseña;
    private Button btnLogIn;
    private Button btnCancelar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtContraseña = findViewById(R.id.txtContraseña);
        btnLogIn = findViewById(R.id.btnLogIn);
        txtMail = findViewById(R.id.txtMail);
        btnCancelar = findViewById(R.id.btnCancelar);
    }


    public void login(View view) {
        Intent i = new Intent(this, LoginActivity.class);

        String dato = txtUsuario.getText().toString();
        i.putExtra("REGISTRO", dato);

        startActivity(i);
    }

    public void Cancelar(View view) {
        Intent i = new Intent(this, LoginActivity.class);

        String dato = txtUsuario.getText().toString();
        i.putExtra("CANCELAR", dato);

        startActivity(i);
    }
}