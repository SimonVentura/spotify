package com.example.umlventura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btnInserisci;
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
        spnGeneri = (Spinner) findViewById(R.id.spnGeneri);
        gb = new gestoreBrani();

        ArrayAdapter<String> aaG = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item,generi
        );
        spnGeneri.setAdapter(aaG);



        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String genSelez = spnGeneri.getSelectedItem().toString();
                gb.addBrano(txtTitolo.getText().toString(),genSelez);

            }
        });
    }
}