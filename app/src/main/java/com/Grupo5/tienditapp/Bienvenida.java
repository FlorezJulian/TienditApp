package com.Grupo5.tienditapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Grupo5.tienditapp.ui.LogIn;

public class Bienvenida extends AppCompatActivity {

    private Object Registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
    }

    public void Loguear(View view){
        Intent loguear = new Intent(this, LogIn.class);
        startActivity(loguear);
    }

    public void Registrarse(View view){
        Intent registrarse = new Intent(this, com.Grupo5.tienditapp.Registro.class);
        startActivity(registrarse);
    }

}