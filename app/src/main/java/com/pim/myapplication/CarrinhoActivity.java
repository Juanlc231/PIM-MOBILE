package com.pim.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CarrinhoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrinho);

        Button buttonFrete = findViewById(R.id.para_frete);
        buttonFrete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CarrinhoActivity.this, FreteActivity.class);
                startActivity(intent);
            }
        });
    }
}
