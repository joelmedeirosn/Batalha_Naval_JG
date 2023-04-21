package controller;

import model.*;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Movimento implements ActionListener {

    private Tabuleiro tabuleiro;
    private Tabuleiro tabuleiroP2;
    Navios navios = new Navios(4,3,2,1,1);
    private int contador1, contador2, contador3, contador4, contador5;
    private Player player;


    public Movimento(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void actionPerformed(ActionEvent e){

        for(int i = 0; i<tabuleiro.getGrid().length;i++){
            for(int j = 0;j<tabuleiro.getGrid()[i].length;j++){
                if (e.getSource() == tabuleiro.getGrid()){

                    if (navios.getSaberNavio() == 1 && contador1 < navios.getQuant1Cano() && tabuleiro.getGrid()[i][j].getText().isEmpty()){
                        tabuleiro.getGrid()[i][j].setText("N");

                        contador1++;

                    } else if (navios.getSaberNavio() == 2 && contador2 < navios.getQuant2Canos() && tabuleiro.getGrid()[i][j].getText().isEmpty()
                            && tabuleiro.getGrid()[i][j+1].getText().isEmpty()) {
                        tabuleiro.getGrid()[i][j].setText("N");
                        tabuleiro.getGrid()[i][j+1].setText("N");

                        contador2++;

                    } else if (navios.getSaberNavio() == 3 && contador3 < navios.getQuant3Canos() && tabuleiro.getGrid()[i][j].getText().isEmpty()
                            && tabuleiro.getGrid()[i][j+1].getText().isEmpty() && tabuleiro.getGrid()[i][j+2].getText().isEmpty()){

                        tabuleiro.getGrid()[i][j].setText("N");
                        tabuleiro.getGrid()[i][j+1].setText("N");
                        tabuleiro.getGrid()[i][j+2].setText("N");

                        contador3++;

                    } else if (navios.getSaberNavio() == 4 && contador4 < navios.getQuant4Canos() && tabuleiro.getGrid()[i][j].getText().isEmpty() && tabuleiro.getGrid()[i][j+1].getText().isEmpty()
                            && tabuleiro.getGrid()[i][j+2].getText().isEmpty() && tabuleiro.getGrid()[i][j+3].getText().isEmpty()){
                        tabuleiro.getGrid()[i][j].setText("N");
                        tabuleiro.getGrid()[i][j+1].setText("N");
                        tabuleiro.getGrid()[i][j+2].setText("N");
                        tabuleiro.getGrid()[i][j+3].setText("N");

                        contador4++;

                    } else if (navios.getSaberNavio() == 5 && contador5 < navios.getQuantAvioes() && tabuleiro.getGrid()[i][j].getText().isEmpty() && tabuleiro.getGrid()[i][j+1].getText().isEmpty()
                            && tabuleiro.getGrid()[i][j+2].getText().isEmpty() && tabuleiro.getGrid()[i+1][j+1].getText().isEmpty() && tabuleiro.getGrid()[i+2][j+1].getText().isEmpty()){
                        tabuleiro.getGrid()[i][j].setText("P");
                        tabuleiro.getGrid()[i][j+1].setText("P");
                        tabuleiro.getGrid()[i][j+2].setText("P");
                        tabuleiro.getGrid()[i+1][j+1].setText("P");
                        tabuleiro.getGrid()[i+2][j+1].setText("P");

                        contador5++;
                    }
                }
            }
        }
    }
}
