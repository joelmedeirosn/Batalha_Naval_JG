package model;

import java.util.Scanner;
import java.lang.*;

public class BatalhaNaval extends Navios implements Grelha{
    Player player;
    private char[][] dimensoes = new char[10][10];
    private int[] linhaA = new int [3];
    private int[] linhaD = new int [10];
    private int[] colunaA = new int [3];
    private int[] colunaD = new int [10];


    public BatalhaNaval(Player player, int quant1Cano, int quant2Canos, int quant3Canos, int quant4Canos, int quantAvioes) {
        super(quant1Cano,quant2Canos,quant3Canos,quant4Canos,quantAvioes);
        this.player = player;
        grelha();
    }

    public void grelha(){
        for(int i=0;i<dimensoes.length; i++) {
            for (int j = 0; j < dimensoes.length; j++) {
                dimensoes[i][j] = '□';
            }
        }
    }

    public void coordenada1Cano() throws CoordenadaNavioException{ //implementar as exceptions em cada um dos metodos
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < getQuant1Cano();i++){
            System.out.println("Selecione a Linha do navio de 1 cano #"+ (i + 1) +": ");
            linhaD[i] = (scanner.nextInt() - 1);

            if (linhaD[i] > 9 || linhaD[i] < 0){
                CoordenadaNavioException e = new CoordenadaNavioException();
                throw e;
            }

            System.out.println("Selecione a Coluna do navio de 1 cano #"+ (i + 1) +": ");
            colunaD[i] = (scanner.nextInt() - 1);

            if (colunaD[i] > 9 || colunaD[i] < 0){
                CoordenadaNavioException e = new CoordenadaNavioException();
                throw e;
            }
            ganhou(linhaD[i],colunaD[i]);
        }
    }

    public void coordenada2Canos() throws CoordenadaNavioException{
        Scanner scanner = new Scanner(System.in);
        for (int i = getQuant1Cano(); i < (getQuant1Cano() + getQuant2Canos());i++){
            System.out.println("Selecione a Linha do navio de 2 canos #"+ (i - (getQuant1Cano() - 1)) +" ");
            linhaD[i] = (scanner.nextInt() - 1);
            if (linhaD[i] > 9 || linhaD[i] < 0){
                CoordenadaNavioException e = new CoordenadaNavioException();
                throw e;
            }

            System.out.println("Selecione a Coluna do navio de 2 canos #"+ (i-(getQuant1Cano() - 1 )) +" ");
            colunaD[i] = (scanner.nextInt() - 1);
            //
            if (colunaD[i] > 8 || colunaD[i] < 0){
                System.out.println("Os Navios de 2 Canos devem ter suas colunas definidas entre 1 e 9");
                CoordenadaNavioException e = new CoordenadaNavioException();
                throw e;
            }
            ganhou(linhaD[i],colunaD[i]);
        }
    }

    public void coordenada3Canos() throws CoordenadaNavioException{
        Scanner scanner = new Scanner(System.in);
        for (int i = (getQuant1Cano() + getQuant2Canos()); i < (getQuant1Cano() + getQuant2Canos() + getQuant3Canos());i++){
            System.out.println("Selecione a Linha do navio de 3 canos #"+ (i-(getQuant1Cano() - 1 )) +" ");
            linhaD[i] = (scanner.nextInt() - 1);
            if (linhaD[i] > 9 || linhaD[i] < 0){
                CoordenadaNavioException e = new CoordenadaNavioException();
                throw e;
            }
            System.out.println("Selecione a Coluna do navio de 3 canos #"+ (i-(getQuant1Cano() - 1 )) +" ");
            colunaD[i] = (scanner.nextInt() - 1);
            if (colunaD[i] > 7 || colunaD[i] < 0){
                System.out.println("Os Navios de 3 Canos devem ter suas colunas definidas entre 1 e 8");
                CoordenadaNavioException e = new CoordenadaNavioException();
                throw e;
            }
            ganhou(linhaD[i],colunaD[i]);
        }
    }

    public void coordenada4Canos() throws CoordenadaNavioException{
        Scanner scanner = new Scanner(System.in);
        for (int i = (getQuant1Cano() + getQuant2Canos() + getQuant3Canos()); i < (getQuant1Cano() + getQuant2Canos() + getQuant3Canos() + getQuant4Canos());i++){
            System.out.println("Selecione a Linha do navio de 4 canos #"+ (i-(getQuant1Cano() - 1 )) +" ");
            linhaD[i] = (scanner.nextInt() - 1);
            if (linhaD[i] > 9 || linhaD[i] < 0){
                CoordenadaNavioException e = new CoordenadaNavioException();
                throw e;
            }
            System.out.println("Selecione a Coluna do navio de 4 canos #"+ (i-(getQuant1Cano() - 1 )) +" ");
            colunaD[i] = (scanner.nextInt() - 1);
            if (colunaD[i] > 6 || colunaD[i] < 0){
                System.out.println("Os Navios de 4 Canos devem ter suas colunas definidas entre 1 e 7");
                CoordenadaNavioException e = new CoordenadaNavioException();
                throw e;
            }
            ganhou(linhaD[i],colunaD[i]);
        }
    }

    public void coordenadaAvioes() throws CoordenadaNavioException{
        Scanner scanner = new Scanner(System.in);
        for (int i = (getQuant1Cano() + getQuant2Canos() + getQuant3Canos() + getQuant4Canos()); i < (getQuant1Cano() + getQuant2Canos() + getQuant3Canos() + getQuant4Canos() + getQuantAvioes());i++){
            System.out.println("Selecione a Linha do navio porta-avioes #"+ (i-(getQuant1Cano() - 1 )) +" ");
            linhaD[i] = (scanner.nextInt() - 1);
            //
            if (linhaD[i] > 7 || linhaD[i] < 0){
                System.out.println("Os navios porta-avioes devem ter suas linhas definidas entre 1 e 8");
                CoordenadaNavioException e = new CoordenadaNavioException();
                throw e;
            }
            System.out.println("Selecione a Coluna do navio porta-avioes #"+ (i-(getQuant1Cano() - 1 )) +" ");
            colunaD[i] = (scanner.nextInt() - 1);
            if (colunaD[i] > 7 || colunaD[i] < 0){
                System.out.println("Os navios porta-avioes devem ter suas colunas definidas entre 1 e 8");
                CoordenadaNavioException e = new CoordenadaNavioException();
                throw e;
            }
            ganhou(linhaD[i],colunaD[i]);
        }
    }

    public void formatoNavios(BatalhaNaval x) throws CoordenadaNavioException{ //falta implementar cada tipo de navio no tabuleiro e a exception
        try {coordenada1Cano();
            coordenada2Canos();
            coordenada3Canos();
            coordenada4Canos();
            coordenadaAvioes();
        } catch (CoordenadaNavioException e) {
            System.out.println(e.getMessage());
        }

        for(int i = 0; i < (getQuant1Cano()); i++) {
            // n esquecer -> x.dimensoes.length
            x.dimensoes[linhaD[i]][colunaD[i]] = navio();
        }

        for(int i = (getQuant1Cano()); i < (getQuant2Canos() + getQuant1Cano()); i++) {
            // n esquecer -> x.dimensoes.length
            x.dimensoes[linhaD[i]][colunaD[i]] = navio();
            x.dimensoes[linhaD[i]][colunaD[i]+1] = navio();
        }

        for(int i = (getQuant1Cano()+getQuant2Canos()); i < (getQuant1Cano()+getQuant2Canos()+getQuant3Canos()); i++) {
            // n esquecer -> x.dimensoes.length
            x.dimensoes[linhaD[i]][colunaD[i]] = navio();
            x.dimensoes[linhaD[i]][colunaD[i]+1] = navio();
            x.dimensoes[linhaD[i]][colunaD[i]+2] = navio();
        }
        for(int i = (getQuant1Cano()+getQuant2Canos()+getQuant3Canos()); i < (getQuant1Cano()+getQuant2Canos()+getQuant3Canos()+getQuant4Canos()); i++) {
            // n esquecer -> x.dimensoes.length
            x.dimensoes[linhaD[i]][colunaD[i]] = navio();
            x.dimensoes[linhaD[i]][colunaD[i]+1] = navio();
            x.dimensoes[linhaD[i]][colunaD[i]+2] = navio();
            x.dimensoes[linhaD[i]][colunaD[i]+3] = navio();
        }
        for(int i = (getQuant1Cano()+getQuant2Canos()+getQuant3Canos()+getQuant4Canos()); i < (getQuant1Cano()+getQuant2Canos()+getQuant3Canos()+getQuant4Canos()+getQuantAvioes()); i++) {
            x.dimensoes[linhaD[i]][colunaD[i]] = navioAvioes();
            x.dimensoes[linhaD[i]][colunaD[i]+1] = navioAvioes();
            x.dimensoes[linhaD[i]][colunaD[i]+2] = navioAvioes();
            x.dimensoes[linhaD[i]+1][colunaD[i]+1] = navioAvioes();
            x.dimensoes[linhaD[i]+2][colunaD[i]+1] = navioAvioes();
        }

        for(int i = 0; i< x.dimensoes.length; i++){
            for(int j = 0; j< x.dimensoes.length; j++){
                System.out.print(x.dimensoes[i][j]);
            }
            System.out.println();
        }
    }

    public boolean ganhou(int i, int j){
        // Checagem da vitoria do player
        if(dimensoes[i][j] == '□'){
            return true;
        } else{
            return false;
        }
    }

    public void atacarNavio(BatalhaNaval x){

        Scanner scanner = new Scanner(System.in);
        //while(getQuant1Cano()!=0 || getQuant2Canos()!=0 || getQuant3Canos()!=0 || getQuant4Canos()!=0 || getQuantAvioes()!=0){
        for(int i = 0; i < 3;i++){
            System.out.println("Selecione a Linha, ");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            linhaA[i] = (scanner.nextInt() - 1);
            while (linhaA[i] > 9 || linhaA[i] < 0) {
                System.out.println("Selecione uma Linha válida");
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                linhaA[i] = (scanner.nextInt() - 1);
            }
            System.out.println("Selecione a Coluna");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            colunaA[i] = (scanner.nextInt() - 1);
            while (colunaA[i] > 9 || colunaA[i] < 0) {
                System.out.println("Selecione uma Coluna válida");
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                colunaA[i] = (scanner.nextInt() - 1);
            }
        }
        for(int i = 0; i < 3; i++) { //n esquece brother -> x.dimensoes.length
            if (x.dimensoes[linhaA[i]][colunaA[i]] == 'N' || x.dimensoes[linhaA[i]][colunaA[i]] == 'P'){
                x.dimensoes[linhaA[i]][colunaA[i]] = 'X';  // Checa o acerto do tiro e substitui o valor do navio acertado por "X"
            } else {
                x.dimensoes[linhaA[i]][colunaA[i]] = 'A'; // Atribui o valor "A" para o ataque errado
            }
        }
        for(int i = 0; i< x.dimensoes.length; i++) {
            for(int j = 0; j< x.dimensoes.length; j++){
                System.out.print(x.dimensoes[i][j]);
            }
            System.out.println();
        }
        //}
        player.setGanhou(true);
    }

    /*public char[][] getDimensoes() {
        return dimensoes;
    }
    public int[] getLinhaA() {
        return linhaA;
    }
    public void setLinhaA(int[] NavioPositionLine) {this.linhaA = NavioPositionLine;}
    public int[] getColunaA(){
        return colunaA;
    }
    public void setColunaA(int[] NavioPositionCol) {this.colunaA = NavioPositionCol;}
    public void setDimensoes(char[][] dimensoes) {
        this.dimensoes = dimensoes;
    }
    public char[][] dimensoes() {
        return dimensoes;
    }*/


}
