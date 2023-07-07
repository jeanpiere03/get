package com.example.miaplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginEmpity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_empity);
    }

    public void registration(View view) {
        startActivity(new Intent(loginEmpity.this,RegsiterActivity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(loginEmpity.this,MainActivity.class));
    }
}