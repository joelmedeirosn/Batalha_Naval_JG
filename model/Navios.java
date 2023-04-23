package model;

import java.util.Scanner;

public class Navios{
    private int quantAvioes; //4
    private int quant4Canos; //3
    private int quant3Canos; //2
    private int quant2Canos; //1
    private int quant1Cano; //1
    private int saberNavio;

    public int getSaberNavio() {
        return saberNavio;
    }

    public void setSaberNavio(int saberNavio) {
        this.saberNavio = saberNavio;
    }


    public Navios(int quant1Cano, int quant2Canos, int quant3Canos, int quant4Canos, int quantAvioes){
        this.saberNavio = 0;
        this.quant1Cano = quant1Cano;
        this.quant2Canos = quant2Canos;
        this.quant3Canos = quant3Canos;
        this.quant4Canos = quant4Canos;
        this.quantAvioes = quantAvioes;
    }

    public int getQuantAvioes() {
        return quantAvioes;
    }
    public int getQuant4Canos() {
        return quant4Canos;
    }
    public int getQuant3Canos() {
        return quant3Canos;
    }
    public int getQuant2Canos() {
        return quant2Canos;
    }
    public int getQuant1Cano() {
        return quant1Cano;
    }

    public void setQuantAvioes(int quantAvioes) {
        this.quantAvioes = quantAvioes;
    }

    public void setQuant4Canos(int quant4Canos) {
        this.quant4Canos = quant4Canos;
    }

    public void setQuant3Canos(int quant3Canos) {
        this.quant3Canos = quant3Canos;
    }

    public void setQuant2Canos(int quant2Canos) {
        this.quant2Canos = quant2Canos;
    }

    public void setQuant1Cano(int quant1Cano) {
        this.quant1Cano = quant1Cano;
    }
}
