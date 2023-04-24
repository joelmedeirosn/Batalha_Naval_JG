package model;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.LinkPermission;
import java.util.Arrays;
import java.util.Scanner;


public class Player {
    private String playerName;
    private boolean ganhou = false;

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

    public boolean isGanhou() {
        return ganhou;
    }
    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }

    public void putOnRecords(JLabel time) {
        try {
            FileWriter writer = new FileWriter("record.txt",true);
            writer.write(this.getPlayerName() + " - " + time.getText()+"\n");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public String readRecord() {
        String record="";
        try {
            FileReader reader = new FileReader("record.txt");
            int caracter= reader.read();
            while(caracter!=-1) {
                record = record + (char)caracter;
                caracter=reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return record;
    }

    public String treatRecords() {
        String[] linhas = readRecord().split("\n");
        String [] playerAndScore = new String[linhas.length];
        String [] player = new String[linhas.length];
        String [] score = new String[linhas.length];
        String top10="";

        for (int i = 0; i < linhas.length; i++) {
            playerAndScore[i]= linhas[i].substring(linhas[i].lastIndexOf("-")+2)+" "+linhas[i].substring(0,linhas[i].lastIndexOf("-")-1);
        }

        Arrays.sort(playerAndScore);

        for (int i = 0; i < linhas.length; i++) {
            score[i] = playerAndScore[i].substring(0,playerAndScore[i].lastIndexOf(" "));
            player[i] = playerAndScore[i].substring(playerAndScore[i].lastIndexOf(" ")+1);
        }

        if(linhas.length>10) {
            for (int i = 0; i < 10; i++) {
                top10 = top10 + (player[i] + " - " + score[i]+"\n");
            }
        }else {
            for (int i = 0; i < linhas.length; i++) {
                top10 = top10 + (player[i] + " - " + score[i]+"\n");
            }
        }

        return top10;

    }



}