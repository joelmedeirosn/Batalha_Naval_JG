package controller;

import model.*;
import view.Jogadores;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Movimento implements ActionListener {
    private Jogadores jogadores;
    Navios navios = new Navios(4,3,2,1,1);
    private int contador1, contador2, contador3, contador4, contador5;
    private JButton[][] botoes;
    public Movimento(JButton[][] botoes) {
        this.jogadores = new Jogadores();
        this.botoes = botoes;
    }


    public void actionPerformed(ActionEvent e){

        for(int i = 0; i < this.botoes.length;i++){
            for(int j = 0;j < this.botoes[i].length;j++){
                if (e.getSource() == botoes[i][j]){
                    if (jogadores.playerAtual.getSaberNavio() == 1 && contador1 < navios.getQuant1Cano() && this.botoes[i][j].getText().isEmpty()){
                        botoes[i][j].setText("N");
                        if (jogadores.playerAtual.getTabuleiro().getDimensoes() != null)
                        {
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i,j,'N');
                        }
                        contador1++;

                    } else if (jogadores.playerAtual.getSaberNavio() == 2 && contador2<navios.getQuant2Canos() && this.botoes[i][j].getText().isEmpty() && this.botoes[i][j+1].getText().isEmpty()) {
                        botoes[i][j].setText("N");
                        botoes[i][j+1].setText("N");
                        if (jogadores.playerAtual.getTabuleiro().getDimensoes() != null)
                        {
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i,j,'N');
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i,(j+1),'N');
                        }
                        contador2++;

                    } else if (jogadores.playerAtual.getSaberNavio() == 3 && contador3<navios.getQuant3Canos() && this.botoes[i][j].getText().isEmpty()
                            && this.botoes[i][j+1].getText().isEmpty() && this.botoes[i][j+2].getText().isEmpty()){
                        botoes[i][j].setText("N");
                        botoes[i][j+1].setText("N");
                        botoes[i][j+2].setText("N");
                        if (jogadores.playerAtual.getTabuleiro().getDimensoes() != null)
                        {
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i,j,'N');
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i,(j+1),'N');
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i,(j+2),'N');
                        }
                        contador3++;

                    } else if (jogadores.playerAtual.getSaberNavio() == 4 && contador4<navios.getQuant4Canos() && this.botoes[i][j].getText().isEmpty() && this.botoes[i][j+1].getText().isEmpty()
                            && this.botoes[i][j+2].getText().isEmpty() && this.botoes[i][j+3].getText().isEmpty()){
                        botoes[i][j].setText("N");
                        botoes[i][j+1].setText("N");
                        botoes[i][j+2].setText("N");
                        botoes[i][j+3].setText("N");
                        if (jogadores.playerAtual.getTabuleiro().getDimensoes() != null) {
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i, j, 'N');
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i, (j + 1), 'N');
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i, (j + 2), 'N');
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i, (j + 3), 'N');
                        }
                        contador4++;

                    } else if (jogadores.playerAtual.getSaberNavio() == 5 && contador5 < navios.getQuantAvioes() && this.botoes[i][j].getText().isEmpty() && this.botoes[i][j+1].getText().isEmpty()
                            && this.botoes[i][j+2].getText().isEmpty() && this.botoes[i+1][j+1].getText().isEmpty() && this.botoes[i+2][j+1].getText().isEmpty()){
                        botoes[i][j].setText("P");
                        botoes[i][j+1].setText("P");
                        botoes[i][j+2].setText("P");
                        botoes[i+1][j+1].setText("P");
                        botoes[i+2][j+1].setText("P");
                        if (jogadores.playerAtual.getTabuleiro().getDimensoes() != null) {
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i, j, 'P');
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i, (j + 1), 'P');
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i, (j + 2), 'P');
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i+1, (j + 1), 'P');
                            jogadores.playerAtual.getTabuleiro().setDimensoes(i+2, (j + 1), 'P');
                        }
                        contador5++;
                    }
                }
            }
        }
    }
}
