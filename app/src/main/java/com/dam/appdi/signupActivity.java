package com.dam.appdi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

    }


    public void login(View view) {
        Intent i = new Intent(this, LoginActivity.class);

        startActivity(i);
    }

    public void Cancelar(View view) {
        Intent i = new Intent(this, LoginActivity.class);

        startActivity(i);
    }
}