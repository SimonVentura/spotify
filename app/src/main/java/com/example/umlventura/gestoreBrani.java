package com.example.umlventura;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class gestoreBrani {


    ArrayList<Brano> listaBrani;

    public gestoreBrani(){

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
}
