package controller;

import model.Tabuleiro;
import model.Player;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Movimento implements ActionListener {

    private Tabuleiro batalha;
    private Player player;
    private JButton[][] botoes;
    public Movimento(Player player, JButton[][] botoes) {
        this.player = player;
        this.botoes = botoes;
    }

    public void actionPerformed(ActionEvent e){
        // BatalhaNaval batalhaNaval = new BatalhaNaval(player, );
        for(int i = 0; i<this.botoes.length;i++){
            for(int j = 0;j<this.botoes[i].length;j++){
                if (e.getSource() == botoes[i][j]){
                    if (player.getSaberNavio() == 1){
                        botoes[i][j].setText("N");
                        if (this.batalha != null)
                        {
                            batalha.setDimensoes(i,j,'N');
                        }
                    } else if (player.getSaberNavio() == 2)
                    {
                        botoes[i][j].setText("N");
                        botoes[i][j+1].setText("N");
                        if (this.batalha != null)
                        {
                            batalha.setDimensoes(i,j,'N');
                            batalha.setDimensoes(i,(j+1),'N');
                        }
                    } else if (player.getSaberNavio() == 3){
                        botoes[i][j].setText("N");
                        botoes[i][j+1].setText("N");
                        botoes[i][j+2].setText("N");
                        if (this.batalha != null)
                        {
                            batalha.setDimensoes(i,j,'N');
                            batalha.setDimensoes(i,(j+1),'N');
                            batalha.setDimensoes(i,(j+2),'N');
                        }
                    } else if (player.getSaberNavio() == 4){
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
                    } else if (player.getSaberNavio() == 5){
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
                    }
                }

            }
        }
    }
}
