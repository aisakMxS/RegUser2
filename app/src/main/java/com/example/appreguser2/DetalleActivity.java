package com.example.appreguser2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.appreguser2.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetalleBinding binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");

        binding.txtUser.setText(nombre);
    }
}