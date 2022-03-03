package com.example.umlventura;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class gestoreBrani {
    ArrayList<Brano> listaBrani;
    gestore g;

    public gestoreBrani(){
        listaBrani= new ArrayList<Brano>();
    }

    public void addBrano(String titolo,String genere,gestore g)
    {
        Brano br = new Brano(titolo,genere);
        listaBrani.add(br);
        this.g=g;
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
        for (Brano brC : listaBrani)
        {
            sbBrani.append(brC.toString());
        }
        return sbBrani;
    }
}
