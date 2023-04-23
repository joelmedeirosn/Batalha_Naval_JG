package controller;

import model.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovimentoDefesa implements ActionListener {

    private Tabuleiro tabuleiro;
    private Navios navios;
    private int contador1, contador2, contador3, contador4, contador5;
    public MovimentoDefesa(Tabuleiro tabuleiro, Navios navios) {
        this.tabuleiro = tabuleiro;
        this.navios = navios;
    }

    public void setContador1(int contador1) {
        this.contador1 = contador1;
    }

    public int getContador1() {
        return contador1;
    }

    public int getContador2() {
        return contador2;
    }

    public int getContador3() {
        return contador3;
    }

    public int getContador4() {
        return contador4;
    }

    public int getContador5() {
        return contador5;
    }

    public void actionPerformed(ActionEvent e){

        for(int i = 0; i<tabuleiro.getGrid().length;i++){
            for(int j = 0;j<tabuleiro.getGrid()[i].length;j++){
                if (e.getSource() == tabuleiro.getGrid()[i][j]){

                    if (navios.getSaberNavio() == 1 && contador1 < navios.getQuant1Cano() && tabuleiro.getGrid()[i][j].getText().equals(" ")){
                        tabuleiro.getGrid()[i][j].setText("N");

                        tabuleiro.getGrid()[i][j].setBackground(Color.BLUE);
                        contador1++;

                    } else if (navios.getSaberNavio() == 2 && contador2 < navios.getQuant2Canos() && tabuleiro.getGrid()[i][j].getText().equals(" ")
                            && tabuleiro.getGrid()[i][j+1].getText().equals(" ")) {
                        tabuleiro.getGrid()[i][j].setText("N");
                        tabuleiro.getGrid()[i][j+1].setText("N");

                        tabuleiro.getGrid()[i][j].setBackground(Color.BLUE);
                        tabuleiro.getGrid()[i][j+1].setBackground(Color.BLUE);

                        contador2++;

                    } else if (navios.getSaberNavio() == 3 && contador3 < navios.getQuant3Canos() && tabuleiro.getGrid()[i][j].getText().equals(" ")
                            && tabuleiro.getGrid()[i][j+1].getText().equals(" ") && tabuleiro.getGrid()[i][j+2].getText().equals(" ")){

                        tabuleiro.getGrid()[i][j].setText("N");
                        tabuleiro.getGrid()[i][j+1].setText("N");
                        tabuleiro.getGrid()[i][j+2].setText("N");

                        tabuleiro.getGrid()[i][j].setBackground(Color.BLUE);
                        tabuleiro.getGrid()[i][j+1].setBackground(Color.BLUE);
                        tabuleiro.getGrid()[i][j+2].setBackground(Color.BLUE);

                        contador3++;

                    } else if (navios.getSaberNavio() == 4 && contador4 < navios.getQuant4Canos() && tabuleiro.getGrid()[i][j].getText().equals(" ") && tabuleiro.getGrid()[i][j+1].getText().equals(" ")
                            && tabuleiro.getGrid()[i][j+2].getText().equals(" ") && tabuleiro.getGrid()[i][j+3].getText().equals(" ")){
                        tabuleiro.getGrid()[i][j].setText("N");
                        tabuleiro.getGrid()[i][j+1].setText("N");
                        tabuleiro.getGrid()[i][j+2].setText("N");
                        tabuleiro.getGrid()[i][j+3].setText("N");

                        tabuleiro.getGrid()[i][j].setBackground(Color.BLUE);
                        tabuleiro.getGrid()[i][j+1].setBackground(Color.BLUE);
                        tabuleiro.getGrid()[i][j+2].setBackground(Color.BLUE);
                        tabuleiro.getGrid()[i][j+3].setBackground(Color.BLUE);

                        contador4++;

                    } else if (navios.getSaberNavio() == 5 && contador5 < navios.getQuantAvioes() && tabuleiro.getGrid()[i][j].getText().equals(" ") && tabuleiro.getGrid()[i][j+1].getText().equals(" ")
                            && tabuleiro.getGrid()[i][j+2].getText().equals(" ") && tabuleiro.getGrid()[i+1][j+1].getText().equals(" ") && tabuleiro.getGrid()[i+2][j+1].getText().equals(" ")){
                        tabuleiro.getGrid()[i][j].setText("P");
                        tabuleiro.getGrid()[i][j+1].setText("P");
                        tabuleiro.getGrid()[i][j+2].setText("P");
                        tabuleiro.getGrid()[i+1][j+1].setText("P");
                        tabuleiro.getGrid()[i+2][j+1].setText("P");

                        tabuleiro.getGrid()[i][j].setBackground(Color.BLUE);
                        tabuleiro.getGrid()[i][j+1].setBackground(Color.BLUE);
                        tabuleiro.getGrid()[i][j+2].setBackground(Color.BLUE);
                        tabuleiro.getGrid()[i+1][j+1].setBackground(Color.BLUE);
                        tabuleiro.getGrid()[i+2][j+1].setBackground(Color.BLUE);

                        contador5++;
                    }
                }
            }
        }
    }
}
