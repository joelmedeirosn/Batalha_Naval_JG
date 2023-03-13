package model;

import java.util.Scanner;

public class Player {
    private String playerName;
    private boolean ganhou;
    private boolean navioCustom; // modo customizado mais adiante.
    private double timer; // tempo que o player demora pra jogar.
    private int quantAtaques; // quantidade de ataques do jogador.

    public Player(){
    }

    public void setPlayerName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome, jogador:");
        playerName = input.nextLine();

        while (playerName.length()<=2 || playerName.length()>=16){
            System.out.println("Digite um nome entre 3 e 15 caracteres.");
            playerName = input.nextLine();
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
