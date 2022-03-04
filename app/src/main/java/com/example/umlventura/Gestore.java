package com.example.umlventura;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ArrayAdapter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Gestore {

    String nomeFile;
    Context c;
    StringBuilder sB;

    public Gestore(){
    };


    public String leggiFileRaw(Context c)
    {
        String testo="";
        StringBuilder sb = new StringBuilder();
        Resources res = c.getResources();
        InputStream is = res.openRawResource(R.raw.brani);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        try {
            while ((testo = br.readLine()) != null) {
                sb.append(testo + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String scriviFile(String nomeFile, Context c,String testoDaScrivere){
        FileOutputStream fileO;
        String esito="";
        try {
            fileO = c.openFileOutput(nomeFile,Context.MODE_PRIVATE);
            fileO.write(testoDaScrivere.getBytes());
            fileO.close();
            esito="scrittura corretta";
        } catch (FileNotFoundException e) { //FNF
            e.printStackTrace();
            esito="attenzione errore in apertura";
        } catch (IOException e) {          //I/O
            esito="errore in scrittura";
        }
        return esito;
    }
}
