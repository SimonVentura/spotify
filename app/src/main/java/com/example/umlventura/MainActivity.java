package com.example.umlventura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btnInserisci;
    Button btnMostra;
    EditText txtTitolo = (EditText)findViewById(R.id.txtTitolo);
    gestoreBrani gb;
    Spinner spnGeneri;
    String[] generi = {"Pop","Rock","Dance","Trap"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitolo = (EditText)findViewById(R.id.txtTitolo);
        btnInserisci = (Button) findViewById(R.id.btnInserisci);
        btnMostra = (Button) findViewById(R.id.btnMosta);
        spnGeneri = (Spinner) findViewById(R.id.spnGeneri);
        gb = new gestoreBrani();

        ArrayAdapter<String> aaG = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item,generi
        );
        spnGeneri.setAdapter(aaG);

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genSelez = spnGeneri.getSelectedItem().toString();
                gb.addBrano(txtTitolo.getText().toString(), genSelez);
            }
        });
        btnMostra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valoreletto = gb.ListaBrani();
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("stringa",valoreletto);
                startActivity(i);
            }
        });


    }
}