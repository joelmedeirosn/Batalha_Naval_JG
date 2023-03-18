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

    public void setPlayerName() throws NomeInvalidoException{
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome, jogador:");
        playerName = input.nextLine();

        if (playerName.length()<=2 || playerName.length()>=16){
           throw new NomeInvalidoException(); //ajeitar depois com try catch (provavelmente)
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
