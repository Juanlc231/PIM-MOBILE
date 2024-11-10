package com.pim.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FreteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frete);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button buttonFrete = findViewById(R.id.para_pagamento);
        buttonFrete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FreteActivity.this, PagamentoActivity.class);
                startActivity(intent);
            }
        });
    }
}
