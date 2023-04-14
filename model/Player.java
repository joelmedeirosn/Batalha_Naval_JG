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

    public Player(String playerName){
        this.playerName = playerName;
        this.setSaberNavio(0);
    }

    public int getSaberNavio() {
        return saberNavio;
    }

    public void setSaberNavio(int saberNavio) {
        this.saberNavio = saberNavio;
    }

    public void setPlayerName(String playerName) throws  NomeInvalidoException{
        if(playerName==null){
            this.playerName=null;
        } else if(playerName.replaceAll("\\s", "").length()<=14 && playerName.replaceAll("\\s", "").length()>=3){
            this.playerName = playerName.replaceAll("\\s", "");
        } else{
            throw new NomeInvalidoException();
        }
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }

}