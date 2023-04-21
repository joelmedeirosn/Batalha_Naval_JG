package controller;

import model.Navios;
import model.Player;
import model.Tabuleiro;
import view.Defesa;
import view.Menu;
import view.ModoJogo;

import java.awt.*;

public class GameController {



    public static void main(String[] args) {
        Navios navios = new Navios(4,3,2,1,1);
        Tabuleiro tabuleiroP1 = new Tabuleiro(navios);
        Tabuleiro tabuleiroP2 = new Tabuleiro(navios);
        Player player1 = new Player();
        Player player2 = new Player();
        Movimento movimento = new Movimento(tabuleiroP1);
        Defesa defesa = new Defesa(navios, tabuleiroP1, tabuleiroP2, player1, movimento);
        ModoJogo modoJogo = new ModoJogo(player1, player2, defesa);
        Menu menu = new Menu(modoJogo);

    }
}


