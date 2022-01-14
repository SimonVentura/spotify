package com.example.umlventura;

import java.util.ArrayList;

public class gestoreBrani {
    ArrayList<Brano> listaBrani;

    public gestoreBrani(){
        listaBrani= new ArrayList<Brano>();
    }
    public void addBrano(String titolo)
    {
        Brano br = new Brano(titolo);
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
