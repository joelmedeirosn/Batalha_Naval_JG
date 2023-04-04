package controller;

import model.BatalhaNaval;
import model.Player;
import view.Batalha;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Movimento implements ActionListener {
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
                    if (player.getSaberNavio() == 1){
                        botoes[i][j].setText("N");
                    }
                }
            }
        }
    }


}
