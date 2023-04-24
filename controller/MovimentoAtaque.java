package controller;

import model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovimentoAtaque implements ActionListener {
    private Navios navios;
    private Player player;
    private Tabuleiro tabuleiroAtaque;
    private Tabuleiro tabuleiroDefesa;
    private int cont = 1;

    public MovimentoAtaque(Navios navios, Player player, Tabuleiro tabuleiroAtaque, Tabuleiro tabuleiroDefesa) {
        this.navios = navios;
        this.player = player;
        this.tabuleiroAtaque = tabuleiroAtaque;
        this.tabuleiroDefesa = tabuleiroDefesa;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getCont() {
        return cont;
    }

    public void actionPerformed(ActionEvent e){
        for(int i = 0; i<tabuleiroAtaque.getGrid().length;i++){
            for(int j = 0;j<tabuleiroAtaque.getGrid()[i].length;j++){

                if (e.getSource() == tabuleiroAtaque.getGrid()[i][j]){

                    if(tabuleiroDefesa.getGrid()[i][j].getText().equals(" ") && (tabuleiroAtaque.getGrid()[i][j].getText().equals("A")) ){

                    try{
                        if(tabuleiroDefesa.getGrid()[i][j].getText().equals(" ") && (tabuleiroAtaque.getGrid()[i][j].getText().equals("A")) ){
                            throw new AtaqueNavioException();
                        }

                    } catch(AtaqueNavioException x){
                            JOptionPane.showMessageDialog(null, x.getMessage(), "Ataque inválido.", JOptionPane.WARNING_MESSAGE);
                    }

                    } else if((tabuleiroDefesa.getGrid()[i][j].getText().equals("N") || tabuleiroDefesa.getGrid()[i][j].getText().equals("P")) && (tabuleiroAtaque.getGrid()[i][j].getText().equals("X"))) {

                        try{
                            if((tabuleiroDefesa.getGrid()[i][j].getText().equals("N") || tabuleiroDefesa.getGrid()[i][j].getText().equals("P")) && (tabuleiroAtaque.getGrid()[i][j].getText().equals("X")) ){
                                throw new AtaqueNavioException();
                            }

                        } catch(AtaqueNavioException x){
                            JOptionPane.showMessageDialog(null, x.getMessage(), "Ataque inválido.", JOptionPane.WARNING_MESSAGE);
                        }

                    } else if ((tabuleiroDefesa.getGrid()[i][j].getText().equals("N") || tabuleiroDefesa.getGrid()[i][j].getText().equals("P")) && tabuleiroAtaque.getGrid()[i][j].getText().equals(" ")) {
                        tabuleiroAtaque.getGrid()[i][j].setText("X");
                        tabuleiroAtaque.getGrid()[i][j].setBackground(Color.GREEN);
                        cont++;

                    } else if (tabuleiroDefesa.getGrid()[i][j].getText().equals(" ") || tabuleiroAtaque.getGrid()[i][j].getText().equals(" ")) {
                        tabuleiroAtaque.getGrid()[i][j].setText("A");
                        tabuleiroAtaque.getGrid()[i][j].setBackground(Color.RED);
                        cont++;
                    }

                    System.out.println("contador ataque: " + cont +"\n");
                }
            }
        }
    }
}
