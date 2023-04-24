package controller;

import model.Navios;
import model.Tabuleiro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovimentoAtaque implements ActionListener {

    //Classe destinada ao action listener do ataque
    private Tabuleiro tabuleiroAtaque;

    private Tabuleiro tabuleiroDefesa;

    private Navios navios;

    private int cont;

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getCont() {
        return cont;
    }


    public MovimentoAtaque(Tabuleiro tabuleiroAtaque, Tabuleiro tabuleiroDefesa) {
        this.tabuleiroAtaque = tabuleiroAtaque;
        this.tabuleiroDefesa = tabuleiroDefesa;
    }



    public void actionPerformed(ActionEvent e){
        for(int i = 0; i<tabuleiroAtaque.getGrid().length;i++){
            for(int j = 0;j<tabuleiroAtaque.getGrid()[i].length;j++){

                if (e.getSource() == tabuleiroAtaque.getGrid()[i][j]){

                    if(tabuleiroDefesa.getGrid()[i][j].getText().equals(" ") && tabuleiroAtaque.getGrid()[i][j].getText().equals("A")){

                    } else if (tabuleiroDefesa.getGrid()[i][j].getText().equals(" ") && tabuleiroAtaque.getGrid()[i][j].getText().equals("X")) {

                    } else if ((tabuleiroDefesa.getGrid()[i][j].getText().equals("N") || tabuleiroDefesa.getGrid()[i][j].getText().equals("P")) && tabuleiroAtaque.getGrid()[i][j].getText().equals(" ")) {
                        tabuleiroAtaque.getGrid()[i][j].setText("X");
                        cont++;
                    } else if (tabuleiroDefesa.getGrid()[i][j].getText().equals(" ") || tabuleiroAtaque.getGrid()[i][j].getText().equals(" ")) {
                        tabuleiroAtaque.getGrid()[i][j].setText("A");
                        cont++;
                    }

                    System.out.println(cont);
                }
            }
        }
    }
}
