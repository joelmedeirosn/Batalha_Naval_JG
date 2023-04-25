package controller;

import model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovimentoAtaque implements ActionListener {
    private Navios navios;
    private JLabel tempo;
    private Player player;
    private Cronometro cronometro;
    private Tabuleiro tabuleiroAtaque;
    private Tabuleiro tabuleiroDefesa;
    private int cont = 1;

    public MovimentoAtaque(Navios navios, Player player, Tabuleiro tabuleiroAtaque, Tabuleiro tabuleiroDefesa, JLabel tempo, Cronometro cronometro) {
        this.navios = navios;
        this.player = player;
        this.tabuleiroAtaque = tabuleiroAtaque;
        this.tabuleiroDefesa = tabuleiroDefesa;
        this.tempo = tempo;
        this.cronometro = cronometro;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getCont() {
        return cont;
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
            if(player.isGanhou()){
                JOptionPane.showMessageDialog(null, "Arrr Capitão "+ player.getPlayerName() +"️, você derrubou todos os navios!  ", "🥳🥳🥳PARABENS!!!🥳🥳🥳", JOptionPane.INFORMATION_MESSAGE);
                cronometro.pauseP1();
                cronometro.pauseP2();
                player.colocarRecordes(tempo);
                System.exit(0);
            }

        }

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
                    checkVictory(tabuleiroAtaque,tabuleiroDefesa,player);
                }
            }
        }
    }
}
