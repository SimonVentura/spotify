package com.example.umlventura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnInserisci;
    EditText txtTitolo;
    gestoreBrani gb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitolo = (EditText)findViewById((R.id.txtTitolo);
        btnInserisci = (Button) findViewById(R.id.btnInserisci);

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gb.addBrano();
            }
        });
    }
}