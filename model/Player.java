package model;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Player {
    private Player player;


    private Tabuleiro tabuleiro;
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    private String playerName;
    private boolean ganhou;
    private double timer; // tempo que o player demora pra jogar.
    private int quantAtaques; // quantidade de ataques do jogador.
    private int saberNavio;

    public Player(String playerName, Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
        this.playerName = playerName;
        this.setSaberNavio(0);
    }

    public int getSaberNavio() {
        return saberNavio;
    }

    public void setSaberNavio(int saberNavio) {
        this.saberNavio = saberNavio;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) throws  NomeInvalidoException{
        if(playerName==null){
            this.playerName=null;
        } else if(playerName.replaceAll("\\s", "").length()<=15 && playerName.replaceAll("\\s", "").length()>=3){
            this.playerName = playerName.replaceAll("\\s", "");
        } else{
            throw new NomeInvalidoException();
        }
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }

}