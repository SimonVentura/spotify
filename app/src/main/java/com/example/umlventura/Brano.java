package com.example.umlventura;

import java.util.Date;

public class Brano {
    public String getTitolo() {
        return titolo;
    }

    private String titolo;
    private int durata;
    private String autore;
    private Date dataCreazione;
    private String genere;

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setDataCreazione(Date dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Brano{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                ", autore='" + autore + '\'' +
                ", dataCreazione=" + dataCreazione +
                '}';
    }
    public Brano(String titolo,String genere)
    {
        this.titolo=titolo;
        this.genere=genere;
    }

}



