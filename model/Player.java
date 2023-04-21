package model;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Player {
    private String playerName;
    private boolean ganhou = false;



    public Player(){
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