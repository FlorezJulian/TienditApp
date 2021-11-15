package com.Grupo5.tienditapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Grupo5.tienditapp.Bienvenida;
import com.Grupo5.tienditapp.R;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in2);
    }

    public void Atras2(View view){
        Intent atras = new Intent(this, Bienvenida.class);
        startActivity(atras);
    }
}