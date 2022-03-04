package com.example.umlventura;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class gestoreBrani {
    ArrayList<Brano> listaBrani;
    Gestore g;

    public gestoreBrani(Gestore g){
        this.g=g;
        listaBrani= new ArrayList<Brano>();
    }

    public void addBrano(String titolo,String genere)
    {
        Brano br = new Brano(titolo,genere);
        listaBrani.add(br);
    }

    public void listaBrani()
    {
        StringBuilder stBui = new StringBuilder();

        for (Brano brV : listaBrani)
        {
            stBui.append(brV.toString());
        }
    }

    public StringBuilder ListaBrani(){
        StringBuilder sbBrani = new StringBuilder();
        for (Brano brC : listaBrani) {
            sbBrani.append(brC.toString());
        }
        return sbBrani;
    }
}
