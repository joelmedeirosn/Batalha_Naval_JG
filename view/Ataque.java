package view;

import controller.MovimentoAtaque;
import model.Cronometro;
import model.Navios;
import model.Player;
import model.Tabuleiro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ataque extends JFrame implements ActionListener{
    private JLabel tempo = new JLabel("00:00:00");
    private Cronometro cronometro = new Cronometro(tempo);
    private Navios navios;
    private Player player1;
    private Player player2;
    private Tabuleiro tabuleiroDefesaP1;
    private Tabuleiro tabuleiroDefesaP2;
    private Tabuleiro tabuleiroAtaqueP1 = new Tabuleiro();
    private Tabuleiro tabuleiroAtaqueP2 = new Tabuleiro();
    private MovimentoAtaque movimentoAtaqueP1;
    private MovimentoAtaque movimentoAtaqueP2;
    private JPanel painelTabuleiroP1 = new JPanel(new GridLayout(10, 10));
    private JPanel painelTabuleiroP2 = new JPanel(new GridLayout(10, 10));
    private JPanel painelTempo = new JPanel(new GridLayout());

    public Ataque(Player player1, Player player2, Tabuleiro tabuleiroDefesaP1, Tabuleiro tabuleiroDefesaP2, Navios navios) {

        this.player1 = player1;
        this.player2 = player2;
        this.tabuleiroDefesaP1 = tabuleiroDefesaP1;
        this.tabuleiroDefesaP2 = tabuleiroDefesaP2;
        this.navios = navios;

        this.movimentoAtaqueP1 = new MovimentoAtaque(navios, player1,tabuleiroAtaqueP1, tabuleiroDefesaP2);
        this.movimentoAtaqueP2 = new MovimentoAtaque(navios, player2,tabuleiroAtaqueP2, tabuleiroDefesaP1);

        cronometro.start();
        cronometro.playP1();
        painelTempo.add(tempo);

        this.configTabuleiro(tabuleiroAtaqueP1, movimentoAtaqueP1, painelTabuleiroP1);
        this.configurarGuia(player1, painelTabuleiroP1);
        this.configTabuleiro(tabuleiroAtaqueP2, movimentoAtaqueP2, painelTabuleiroP2);
        this.configurarGuia(player2, painelTabuleiroP2);
        painelTabuleiroP2.setVisible(false);

    }

    public void configurarGuia(Player player, JPanel painelTabuleiro) {
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(false);
        setLayout(null);
        painelTabuleiro.setSize(785, 750);
        painelTabuleiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "" + player.getPlayerName() + ", sua vez de atacar!", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        painelTempo.setBounds(20,10,100,10);

        add(painelTempo);
        add(painelTabuleiro);

    }

    public void configTabuleiro(Tabuleiro tabuleiro, MovimentoAtaque movimento, JPanel painelTabuleiro) {
        for (int i = 0; i < tabuleiro.getGrid().length; i++) {
            for (int j = 0; j < tabuleiro.getGrid()[i].length; j++) {

                tabuleiro.getGrid()[i][j].addActionListener(this);
                tabuleiro.getGrid()[i][j].addActionListener(movimento);
                painelTabuleiro.add(tabuleiro.getGrid()[i][j]);
            }
        }
        add(painelTabuleiro);
    }

    public void checkVictory(Tabuleiro tabuleiroAtaque,Tabuleiro tabuleiroDefesa,Player player){
        int contVictory = 0;

        for (int i = 0; i<tabuleiroAtaque.getGrid().length;i++){
            for (int j = 0; j<tabuleiroAtaque.getGrid().length;j++){
                if (tabuleiroAtaque.getGrid()[i][j].getText().equals("X") && (tabuleiroDefesa.getGrid()[i][j].getText().equals("N") || tabuleiroDefesa.getGrid()[i][j].getText().equals("P"))){
                    contVictory++;
                }
            }
        }

        if(contVictory == ((navios.getQuant1Cano() +
                (2 * navios.getQuant2Canos()) + (3 * navios.getQuant3Canos()) +
                (4 * navios.getQuant4Canos()) + (5 * navios.getQuantAvioes()))))
        {
            player.setGanhou(true);
        }
        System.out.println("contador vitoria: " + contVictory);
    }

    public void actionPerformed(ActionEvent e){

        if(player1.isGanhou()){
            JOptionPane.showMessageDialog(null, "Arrr Capitão"+ player1.getPlayerName() +", você derrubou todos os navios de "+ player2.getPlayerName() +"", "🥳🥳🥳PARABENS!!!🥳🥳🥳", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(player2.isGanhou()){
            JOptionPane.showMessageDialog(null, "Arrr Capitão "+ player2.getPlayerName() +"️, você derrubou todos os navios de"+ player1.getPlayerName() +"", "🥳🥳🥳PARABENS!!!🥳🥳🥳", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        for(int i = 0; i<tabuleiroAtaqueP1.getGrid().length; i++){
            for(int j = 0; j<tabuleiroAtaqueP1.getGrid()[i].length; j++){
                if (e.getSource() == tabuleiroAtaqueP1.getGrid()[i][j]){

                    checkVictory(tabuleiroAtaqueP1,tabuleiroDefesaP2,player1);

                    if (movimentoAtaqueP1.getCont() == 3){
                        movimentoAtaqueP1.setCont(0);
                        cronometro.pauseP1();
                        cronometro.playP2();
                        painelTabuleiroP1.setVisible(false);
                        painelTabuleiroP2.setVisible(true);
                    }

                    checkVictory(tabuleiroAtaqueP1,tabuleiroDefesaP2,player1);
                }
            }
        }

        for(int i = 0; i<tabuleiroAtaqueP2.getGrid().length; i++) {
            for (int j = 0; j < tabuleiroAtaqueP2.getGrid()[i].length; j++) {
                if (e.getSource() == tabuleiroAtaqueP2.getGrid()[i][j]) {

                    checkVictory(tabuleiroAtaqueP2,tabuleiroDefesaP1,player2);

                    if (movimentoAtaqueP2.getCont() == 3) {
                        movimentoAtaqueP2.setCont(0);
                        cronometro.pauseP2();
                        cronometro.playP1();
                        painelTabuleiroP2.setVisible(false);
                        painelTabuleiroP1.setVisible(true);
                    }

                    checkVictory(tabuleiroAtaqueP1,tabuleiroDefesaP2,player1);
                }
            }
        }

        if(player1.isGanhou()){
            JOptionPane.showMessageDialog(null, "Arrr Capitão "+ player1.getPlayerName() +"️, você derrubou todos os navios de "+ player2.getPlayerName() +"", "🥳🥳🥳PARABENS!!!🥳🥳🥳", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(player2.isGanhou()){
            JOptionPane.showMessageDialog(null, "Arrr Capitão "+ player2.getPlayerName() +", você derrubou todos os navios de"+ player1.getPlayerName() +"", "🥳🥳🥳PARABENS!!!🥳🥳🥳", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}



