package controller;

import model.*;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Movimento implements ActionListener {

    private Tabuleiro batalha;
    Navios navios = new Navios(4,3,2,1,1);
    private int contador1, contador2, contador3, contador4, contador5;
    private Player player;
    private JButton[][] botoes;

    public Movimento(Player player, JButton[][] botoes) {
        this.player = player;
        this.botoes = botoes;
    }

    public void actionPerformed(ActionEvent e){

        for(int i = 0; i<this.botoes.length;i++){
            for(int j = 0;j<this.botoes[i].length;j++){
                if (e.getSource() == botoes[i][j]){

                    if (player.getSaberNavio() == 1 && contador1<navios.getQuant1Cano()){
                        botoes[i][j].setText("N");
                        if (this.batalha != null)
                        {
                            batalha.setDimensoes(i,j,'N');
                        }
                        contador1++;

                    } else if (player.getSaberNavio() == 2 && contador2<navios.getQuant2Canos()) {
                        botoes[i][j].setText("N");
                        botoes[i][j+1].setText("N");
                        if (this.batalha != null)
                        {
                            batalha.setDimensoes(i,j,'N');
                            batalha.setDimensoes(i,(j+1),'N');
                        }
                        contador2++;

                    } else if (player.getSaberNavio() == 3 && contador3<navios.getQuant3Canos()){
                        botoes[i][j].setText("N");
                        botoes[i][j+1].setText("N");
                        botoes[i][j+2].setText("N");
                        if (this.batalha != null)
                        {
                            batalha.setDimensoes(i,j,'N');
                            batalha.setDimensoes(i,(j+1),'N');
                            batalha.setDimensoes(i,(j+2),'N');
                        }
                        contador3++;

                    } else if (player.getSaberNavio() == 4 && contador4 < navios.getQuant4Canos()){
                        botoes[i][j].setText("N");
                        botoes[i][j+1].setText("N");
                        botoes[i][j+2].setText("N");
                        botoes[i][j+3].setText("N");
                        if (this.batalha != null) {
                            batalha.setDimensoes(i, j, 'N');
                            batalha.setDimensoes(i, (j + 1), 'N');
                            batalha.setDimensoes(i, (j + 2), 'N');
                            batalha.setDimensoes(i, (j + 3), 'N');
                        }
                        contador4++;

                    } else if (player.getSaberNavio() == 5 && contador5 < navios.getQuantAvioes()){
                        botoes[i][j].setText("P");
                        botoes[i][j+1].setText("P");
                        botoes[i][j+2].setText("P");
                        botoes[i+1][j+1].setText("P");
                        botoes[i+2][j+1].setText("P");
                        if (this.batalha != null) {
                            batalha.setDimensoes(i, j, 'N');
                            batalha.setDimensoes(i, (j + 1), 'N');
                            batalha.setDimensoes(i, (j + 2), 'N');
                            batalha.setDimensoes(i+1, (j + 1), 'N');
                            batalha.setDimensoes(i+2, (j + 1), 'N');
                        }
                        contador5++;
                    }
                }
            }
        }
    }
}
