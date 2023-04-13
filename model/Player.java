package model;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Player {
    Player player;


    private String playerName;
    private boolean ganhou;
    private double timer; // tempo que o player demora pra jogar.
    private int quantAtaques; // quantidade de ataques do jogador.
    private int saberNavio;

    public Player(){
        this.setSaberNavio(0);
    }

    public int getSaberNavio() {
        return saberNavio;
    }

    public void setSaberNavio(int saberNavio) {
        this.saberNavio = saberNavio;
    }

    public void setPlayerName(String x) {
        // fazer exception
        this.playerName = x;
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }

}