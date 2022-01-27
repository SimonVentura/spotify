package com.example.umlventura;

import java.util.Date;

public class Brano {
    public String getTitolo() {
        return titolo;
    }

    private String titolo;
    public int getDurata() {
        return durata;
    }
    public String getAutore() {
        return autore;
    }
    public Date getDataCreazione() {
        return dataCreazione;
    }
    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }

    private int durata;
    private String autore;
    private Date dataCreazione;
    private String genere;

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



