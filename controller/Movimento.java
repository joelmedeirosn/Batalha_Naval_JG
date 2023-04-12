package controller;

import model.*;
import view.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Movimento implements ActionListener {
    private Batalha batalha;
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
                    } else if (player.getSaberNavio() == 2){
                        botoes[i][j].setText("N");
                        botoes[i][j+1].setText("N");
                    } else if (player.getSaberNavio() == 3){
                        botoes[i][j].setText("N");
                        botoes[i][j+1].setText("N");
                        botoes[i][j+2].setText("N");
                    } else if (player.getSaberNavio() == 4){
                        botoes[i][j].setText("N");
                        botoes[i][j+1].setText("N");
                        botoes[i][j+2].setText("N");
                        botoes[i][j+3].setText("N");
                    } else if (player.getSaberNavio() == 5){
                        botoes[i][j].setText("P");
                        botoes[i][j+1].setText("P");
                        botoes[i][j+2].setText("P");
                        botoes[i+1][j+1].setText("P");
                        botoes[i+2][j+1].setText("P");
                                                        //(nao sei se ja deveria puxar de alguma forma o metodo da classe q faz isso no console)

                    }


                }
            }
        }
    }


}
