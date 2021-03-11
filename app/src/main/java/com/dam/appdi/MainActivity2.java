package com.dam.appdi;


import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvInicio;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvInicio = findViewById(R.id.tvInicio);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.itmCorazon){
                    tvInicio.setText(R.string.corazon);
                    tvInicio.setText(R.string.corazon);
                }else if(item.getItemId() == R.id.itmMusica){
                    tvInicio.setText(R.string.musica);
                }else if(item.getItemId() == R.id.itmLocalizacion){
                    tvInicio.setText(R.string.localizacion);
                }else if(item.getItemId() == R.id.itmNews){
                    tvInicio.setText(R.string.news);
                }

                return false;
            }
        });
    }
}
