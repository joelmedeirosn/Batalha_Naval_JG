package view;

import model.Player;
import model.Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class Ataque extends JFrame {
    private Player player1;
    private Player player2;
    private Tabuleiro tabuleiroP1;
    private Tabuleiro tabuleiroP2;
    private Tabuleiro tabuleiroAtaqueP1 = new Tabuleiro();
    private Tabuleiro TabuleiroAtaqueP2 = new Tabuleiro();
    private JPanel painelTabuleiro = new JPanel(new GridLayout(10,10));
    public JPanel getPainelTabuleiro() {
        return painelTabuleiro;
    }

    public Ataque(Player player1,Player player2, Tabuleiro tabuleiroP1, Tabuleiro tabuleiroP2){
        
        configTabuleiro(tabuleiroAtaqueP1);
        configurarGuia(player1);
    }

    public void configurarGuia(Player player){

        //preencher o tabuleiro inteiro
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(false);
        setLayout(null);
        painelTabuleiro.setSize(785,750);
        painelTabuleiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "" + player.getPlayerName() + " sua vez de atacar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        add(painelTabuleiro);
    }

    public void configTabuleiro(Tabuleiro tabuleiro){

        //lembrar de receber parametro para os dois botoes
        for(int i = 0; i<tabuleiro.getGrid().length;i++){
            for(int j = 0;j<tabuleiro.getGrid()[i].length;j++){
                this.painelTabuleiro.add(tabuleiro.getGrid()[i][j]);
            }
        }
        add(this.painelTabuleiro);
    }
}
