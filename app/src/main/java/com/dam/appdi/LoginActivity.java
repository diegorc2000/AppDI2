package com.dam.appdi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v) {

        Intent i = new Intent(this, MainActivity.class);

        startActivity(i);
    }

    public void Registro(View view) {
        Intent i = new Intent(this, signupActivity.class);

        startActivity(i);
    }


}