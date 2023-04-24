package controller;

import model.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovimentoDefesa implements ActionListener {

    private Tabuleiro tabuleiro;
    private Navios navios;
    private int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0;
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
                if (e.getSource() == tabuleiro.getGrid()[i][j]) {

                    if (navios.getSaberNavio() == 1 && contador1 < navios.getQuant1Cano()){
                        try {
                            if(tabuleiro.getGrid()[i][j].getText().equals("N") || tabuleiro.getGrid()[i][j].getText().equals("P")) {
                                throw new CoordenadaNavioException();
                            }
                            if (navios.getSaberNavio() == 1 && contador1 < navios.getQuant1Cano() && tabuleiro.getGrid()[i][j].getText().equals(" ")) {
                                tabuleiro.getGrid()[i][j].setText("N");

                                tabuleiro.getGrid()[i][j].setBackground(Color.BLUE);
                                contador1++;
                            }

                        } catch (CoordenadaNavioException x) {
                            JOptionPane.showMessageDialog(null, x.getMessage(), "Posicionamento inválido.", JOptionPane.WARNING_MESSAGE);
                        }

                    }

                    if (navios.getSaberNavio() == 2 && contador2 < navios.getQuant2Canos()){
                        try{
                            if ((tabuleiro.getGrid()[i][j].getText().equals("N") || tabuleiro.getGrid()[i][j].getText().equals("P")) || ((tabuleiro.getGrid()[i][j+1].getText().equals("N") || tabuleiro.getGrid()[i][j+1].getText().equals("P")))) {
                                throw new CoordenadaNavioException();
                            }
                            if (contador2 < navios.getQuant2Canos() && tabuleiro.getGrid()[i][j].getText().equals(" ") && tabuleiro.getGrid()[i][j+1].getText().equals(" ")) {
                                tabuleiro.getGrid()[i][j].setText("N");
                                tabuleiro.getGrid()[i][j+1].setText("N");

                                tabuleiro.getGrid()[i][j].setBackground(Color.BLUE);
                                tabuleiro.getGrid()[i][j+1].setBackground(Color.BLUE);

                                contador2++;
                            }
                        }catch (CoordenadaNavioException x) {
                            JOptionPane.showMessageDialog(null, x.getMessage(), "Posicionamento inválido.", JOptionPane.WARNING_MESSAGE);
                        }

                    }




                    if (navios.getSaberNavio() == 3 && contador3 < navios.getQuant3Canos()){
                        try{
                            if ((tabuleiro.getGrid()[i][j].getText().equals("N") || tabuleiro.getGrid()[i][j].getText().equals("P")) || (tabuleiro.getGrid()[i][j+1].getText().equals("N") || tabuleiro.getGrid()[i][j+1].getText().equals("P"))
                                || (tabuleiro.getGrid()[i][j+2].getText().equals("N") || tabuleiro.getGrid()[i][j+2].getText().equals("P"))) {
                                throw new CoordenadaNavioException();
                            }

                            if (contador3 < navios.getQuant3Canos() && tabuleiro.getGrid()[i][j].getText().equals(" ")
                                && tabuleiro.getGrid()[i][j+1].getText().equals(" ") && tabuleiro.getGrid()[i][j+2].getText().equals(" ")){

                            tabuleiro.getGrid()[i][j].setText("N");
                            tabuleiro.getGrid()[i][j+1].setText("N");
                            tabuleiro.getGrid()[i][j+2].setText("N");

                            tabuleiro.getGrid()[i][j].setBackground(Color.BLUE);
                            tabuleiro.getGrid()[i][j+1].setBackground(Color.BLUE);
                            tabuleiro.getGrid()[i][j+2].setBackground(Color.BLUE);

                            contador3++;

                            }

                        } catch(CoordenadaNavioException x){
                        JOptionPane.showMessageDialog(null, x.getMessage(), "Posicionamento inválido.", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    if (navios.getSaberNavio() == 4 && contador4 < navios.getQuant4Canos()){
                        try{
                            if ((tabuleiro.getGrid()[i][j].getText().equals("N") || tabuleiro.getGrid()[i][j].getText().equals("P")) || (tabuleiro.getGrid()[i][j+1].getText().equals("N") || tabuleiro.getGrid()[i][j+1].getText().equals("P"))
                                    || (tabuleiro.getGrid()[i][j+2].getText().equals("N") || tabuleiro.getGrid()[i][j+2].getText().equals("P")) || (tabuleiro.getGrid()[i][j+3].getText().equals("N") || tabuleiro.getGrid()[i][j+3].getText().equals("P"))) {
                                throw new CoordenadaNavioException();
                            }
                            if (contador4 < navios.getQuant4Canos() && tabuleiro.getGrid()[i][j].getText().equals(" ") && tabuleiro.getGrid()[i][j+1].getText().equals(" ")
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

                            }

                        }catch(CoordenadaNavioException x){
                            JOptionPane.showMessageDialog(null, x.getMessage(), "Posicionamento inválido.", JOptionPane.WARNING_MESSAGE);

                        }
                    }
                    if (navios.getSaberNavio() == 5 && contador5 < navios.getQuantAvioes()){
                        try{
                            if ((tabuleiro.getGrid()[i][j].getText().equals("N") || tabuleiro.getGrid()[i][j].getText().equals("P")) || (tabuleiro.getGrid()[i][j+1].getText().equals("N") || tabuleiro.getGrid()[i][j+1].getText().equals("P"))
                                    || (tabuleiro.getGrid()[i][j+2].getText().equals("N") || tabuleiro.getGrid()[i][j+2].getText().equals("P")) ||
                                    (tabuleiro.getGrid()[i+1][j+1].getText().equals("N") || tabuleiro.getGrid()[i+1][j+1].getText().equals("P")) || (tabuleiro.getGrid()[i+2][j+1].getText().equals("N") || tabuleiro.getGrid()[i+2][j+1].getText().equals("P"))) {
                                throw new CoordenadaNavioException();
                            }
                            if (contador5 < navios.getQuantAvioes() && tabuleiro.getGrid()[i][j].getText().equals(" ") && tabuleiro.getGrid()[i][j+1].getText().equals(" ")
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

                        }catch(CoordenadaNavioException x){
                            JOptionPane.showMessageDialog(null, x.getMessage(), "Posicionamento inválido.", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
        }
    }
}


