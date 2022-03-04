package com.example.umlventura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
    Gestore g;


    //variabili per il LOG
    String tag="MainActivity";
    String btn1="bottone inserisci";
    String btn2="bottone mostra";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(tag,"lanciato il metodo on create");
        txtTitolo = (EditText)findViewById(R.id.txtTitolo);
        btnInserisci = (Button) findViewById(R.id.btnInserisci);
        btnMostra = (Button) findViewById(R.id.btnMosta);
        spnGeneri = (Spinner) findViewById(R.id.spnGeneri);

        gb = new gestoreBrani(g);
        g = new Gestore();

        ArrayAdapter<String> aaG = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item,generi);
                spnGeneri.setAdapter(aaG);

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genSelez = spnGeneri.getSelectedItem().toString();
                gb.addBrano(txtTitolo.getText().toString(), genSelez);
                Log.d(btn1,"entrato nel metodo onclick per inserire");
            }
        });


        btnMostra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a= g.leggiFileRaw(getApplicationContext());
                //StringBuilder valoreletto = gb.ListaBrani();
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("stringa",a.toString());
                startActivity(i);
                Log.d(btn2,"entrato nel metodo onclick per mostrare");
            }
        });


    }
}