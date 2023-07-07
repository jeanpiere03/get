package com.example.miaplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegsiterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regsiter);
    }

    public void iniciar_sesion(View view) {
        startActivity(new Intent(RegsiterActivity.this,loginEmpity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(RegsiterActivity.this,MainActivity.class));
    }
}