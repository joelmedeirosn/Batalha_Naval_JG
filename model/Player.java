package model;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Player {
    Player player;
    private String playerName;
    private boolean ganhou;

    private int saberNavio;

    public int getSaberNavio() {
        return saberNavio;
    }

    public void setSaberNavio(int saberNavio) {
        this.saberNavio = saberNavio;
    }
    private double timer; // tempo que o player demora pra jogar.
    private int quantAtaques; // quantidade de ataques do jogador.

    public Player(){
        saberNavio = 1;
    }

    public void setPlayerName(String x) {
        // fazer exception
        this.playerName = x;
    }

   /*

    public boolean isGanhou() {
        return ganhou;
    }*/

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }

    /*public boolean isNavioCustom() {
        return navioCustom;
    }

    public void setNavioCustom(boolean navioCustom) {
        this.navioCustom = navioCustom;
    }

    public double getTimer() {
        return timer;
    }

    public void setTimer(double timer) {
        this.timer = timer;
    }

    public int getQuantAtaques() {
        return quantAtaques;
    }

    public void setQuantAtaques(int quantAtaques) {
        this.quantAtaques = quantAtaques;
    }*/
}
