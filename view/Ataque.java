package view;

import controller.MovimentoAtaque;
import model.Player;
import model.Tabuleiro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ataque extends JFrame implements ActionListener{
    private Player player1;
    private Player player2;
    private Tabuleiro tabuleiroDefesaP1;
    private Tabuleiro tabuleiroDefesaP2;
    private Tabuleiro tabuleiroAtaqueP1 = new Tabuleiro();
    private Tabuleiro tabuleiroAtaqueP2 = new Tabuleiro();
    private MovimentoAtaque movimentoAtaqueP1;
    private MovimentoAtaque movimentoAtaqueP2;

    //private JButton[][] botoes = new JButton();

    private JPanel painelTabuleiroP1 = new JPanel(new GridLayout(10, 10));
    private JPanel painelTabuleiroP2 = new JPanel(new GridLayout(10, 10));


    public Ataque(Player player1, Player player2, Tabuleiro tabuleiroDefesaP1, Tabuleiro tabuleiroDefesaP2) {
        this.player1 = player1;
        this.player2 = player2;
        this.tabuleiroDefesaP1 = tabuleiroDefesaP1;
        this.tabuleiroDefesaP2 = tabuleiroDefesaP2;
        this.movimentoAtaqueP1 = new MovimentoAtaque(tabuleiroAtaqueP1, tabuleiroDefesaP2);
        this.movimentoAtaqueP2 = new MovimentoAtaque(tabuleiroAtaqueP2, tabuleiroDefesaP1);
        this.configTabuleiro(tabuleiroAtaqueP1, movimentoAtaqueP1, painelTabuleiroP1);
        this.configurarGuia(player1, painelTabuleiroP1);
        this.configTabuleiro(tabuleiroAtaqueP2, movimentoAtaqueP2, painelTabuleiroP2);
        this.configurarGuia(player2, painelTabuleiroP2);
        painelTabuleiroP2.setVisible(false);
        //this.switchAtaque();
    }

    public void configurarGuia(Player player, JPanel painelTabuleiro) {
        //preencher o tabuleiro inteiro
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(false);
        setLayout(null);
        painelTabuleiro.setSize(785, 750);
        painelTabuleiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "" + player.getPlayerName() + ", sua vez de atacar!", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        add(painelTabuleiro);
    }

    public void configTabuleiro(Tabuleiro tabuleiro, MovimentoAtaque movimento, JPanel painelTabuleiro) {
        //lembrar de receber parametro para os dois botoes
        for (int i = 0; i < tabuleiro.getGrid().length; i++) {
            for (int j = 0; j < tabuleiro.getGrid()[i].length; j++) {
                tabuleiro.getGrid()[i][j].addActionListener(movimento);
                painelTabuleiro.add(tabuleiro.getGrid()[i][j]);
            }
        }
        add(painelTabuleiro);
    }



    public void actionPerformed(ActionEvent e){

        //toda vez que o player clicar num botão ele vai chamar essa função para atualizar o valor do contador

        for(int i = 0; i<tabuleiroAtaqueP1.getGrid().length; i++){
            for(int j = 0; j<tabuleiroAtaqueP1.getGrid()[i].length; j++){
                if (e.getSource() == tabuleiroAtaqueP1.getGrid()[i][j]){

                    if (movimentoAtaqueP1.getCont() == 3){
                        movimentoAtaqueP1.setCont(0);
                        painelTabuleiroP1.setVisible(false);
                        painelTabuleiroP2.setVisible(true);

                    }
                }
            }
        }

        for(int i = 0; i<tabuleiroAtaqueP2.getGrid().length; i++) {
            for (int j = 0; j < tabuleiroAtaqueP2.getGrid()[i].length; j++) {
                if (e.getSource() == tabuleiroAtaqueP2.getGrid()[i][j]) {

                    if (movimentoAtaqueP2.getCont() == 3) {
                        movimentoAtaqueP2.setCont(0);
                        painelTabuleiroP2.setVisible(false);
                        painelTabuleiroP1.setVisible(true);
                    }
                }
            }
        }

    }
}



