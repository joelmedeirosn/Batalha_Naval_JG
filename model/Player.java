package model;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Player {
    Player player;
    private String playerName;
    private boolean ganhou;
    private double timer; // tempo que o player demora pra jogar.
    private int quantAtaques; // quantidade de ataques do jogador.

    public Player(){
    }

    public void setPlayerName() throws NomeInvalidoException{
       Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite seu nome: ");
            playerName = scanner.nextLine();
            if(playerName.length()<=2 || playerName.length()>= 16){
                throw new NomeInvalidoException();
            }


        } catch(NomeInvalidoException e){
            do{
                System.out.println(e.getMessage());
                playerName = scanner.nextLine();
            } while (playerName.length()<=2 || playerName.length()>= 16);
        }

    }

   /* public String getPlayerName() {
        return playerName;
    }

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
