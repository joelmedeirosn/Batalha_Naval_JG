package model;

import javax.swing.*;

public class Tabuleiro implements Grelha{


    private Navios navios;

    private JButton[][] grid;

    public JButton[][] getGrid() {
        return this.grid;
    }
    public void setGrid(JButton[][] grid) {
        this.grid = grid;
    }







    public Tabuleiro() {
        this.grid = new JButton[10][10];
        CriarGrid();
    }

    @Override
    public void CriarGrid() {
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                this.grid[i][j] = new JButton(" ");
            }
        }
    }

    /*
    private int[] linhaA = new int [3];
    private int[] linhaD = new int [10];
    private int[] colunaA = new int [3];
    private int[] colunaD = new int [10];
     */
/*
    public void grelha(Tabuleiro x){
        for(int i=0;i<x.dimensoes.length; i++) {
            for (int j = 0; j < dimensoes.length; j++) {
                dimensoes[i][j] = '□';
            }
        }
    }

    public void coordenada1Cano() throws CoordenadaNavioException{ //implementar as exceptions em cada um dos metodos
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < getQuant1Cano();i++){
            try {
                System.out.println("Selecione a Linha do navio de 1 cano #" + (i + 1) + ": ");
                linhaD[i] = (scanner.nextInt() - 1);
                if (linhaD[i] > 9 || linhaD[i] < 0){
                    throw new CoordenadaNavioException();
                }
            } catch(CoordenadaNavioException e) {
                do{
                    System.out.println(e.getMessage());
                    linhaD[i] = (scanner.nextInt() - 1);
                } while(linhaD[i] > 9 || linhaD[i] < 0);
            }



            try {
                System.out.println("Selecione a Coluna do navio de 1 cano #"+ (i + 1) +": ");
                colunaD[i] = (scanner.nextInt() - 1);
                if (colunaD[i] > 9 || colunaD[i] < 0){
                    throw new CoordenadaNavioException();
                }
            } catch(CoordenadaNavioException e) {
                do{
                    System.out.println(e.getMessage());
                    colunaD[i] = (scanner.nextInt() - 1);
                } while(colunaD[i] > 9 || colunaD[i] < 0);
            }
            ganhou(linhaD[i],colunaD[i]);
        }
    }

    public void coordenada2Canos() throws CoordenadaNavioException{
        Scanner scanner = new Scanner(System.in);
        for (int i = getQuant1Cano(); i < (getQuant1Cano() + getQuant2Canos());i++){
            try {
                System.out.println("Selecione a Linha do navio de 2 canos #" + (i + 1) + ": ");
                linhaD[i] = (scanner.nextInt() - 1);
                if (linhaD[i] > 9 || linhaD[i] < 0){
                    throw new CoordenadaNavioException();
                }
            } catch(CoordenadaNavioException e) {
                do{
                    System.out.println(e.getMessage());
                    linhaD[i] = (scanner.nextInt() - 1);
                } while(linhaD[i] > 9 || linhaD[i] < 0);
            }



            try {
                System.out.println("Selecione a Coluna do navio de 2 canos #"+ (i + 1) +": ");
                colunaD[i] = (scanner.nextInt() - 1);
                if (colunaD[i] > 8 || colunaD[i] < 0){
                    throw new CoordenadaNavioException();
                }
            } catch(CoordenadaNavioException e) {
                do{
                    System.out.println(e.getMessage());
                    colunaD[i] = (scanner.nextInt() - 1);
                } while(colunaD[i] > 8 || colunaD[i] < 0);
            }
            ganhou(linhaD[i],colunaD[i]);
        }
    }

    public void coordenada3Canos() throws CoordenadaNavioException{
        Scanner scanner = new Scanner(System.in);
        for (int i = (getQuant1Cano() + getQuant2Canos()); i < (getQuant1Cano() + getQuant2Canos() + getQuant3Canos());i++){
            try {
                System.out.println("Selecione a Linha do navio de 3 canos #" + (i + 1) + ": ");
                linhaD[i] = (scanner.nextInt() - 1);
                if (linhaD[i] > 9 || linhaD[i] < 0){
                    throw new CoordenadaNavioException();
                }
            } catch(CoordenadaNavioException e) {
                do{
                    System.out.println(e.getMessage());
                    linhaD[i] = (scanner.nextInt() - 1);
                } while(linhaD[i] > 9 || linhaD[i] < 0);
            }



            try {
                System.out.println("Selecione a Coluna do navio de 3 canos #"+ (i + 1) +": ");
                colunaD[i] = (scanner.nextInt() - 1);
                if (colunaD[i] > 7 || colunaD[i] < 0){
                    throw new CoordenadaNavioException();
                }
            } catch(CoordenadaNavioException e) {
                do{
                    System.out.println(e.getMessage());
                    colunaD[i] = (scanner.nextInt() - 1);
                } while(colunaD[i] > 7 || colunaD[i] < 0);
            }
            ganhou(linhaD[i],colunaD[i]);
        }
    }

    public void coordenada4Canos() throws CoordenadaNavioException{
        Scanner scanner = new Scanner(System.in);
        for (int i = (getQuant1Cano() + getQuant2Canos() + getQuant3Canos()); i < (getQuant1Cano() + getQuant2Canos() + getQuant3Canos() + getQuant4Canos());i++){
            try {
                System.out.println("Selecione a Linha do navio de 4 canos #" + (i + 1) + ": ");
                linhaD[i] = (scanner.nextInt() - 1);
                if (linhaD[i] > 9 || linhaD[i] < 0){
                    throw new CoordenadaNavioException();
                }
            } catch(CoordenadaNavioException e) {
                do{
                    System.out.println(e.getMessage());
                    linhaD[i] = (scanner.nextInt() - 1);
                } while(linhaD[i] > 9 || linhaD[i] < 0);
            }



            try {
                System.out.println("Selecione a Coluna do navio de 4 canos #"+ (i + 1) +": ");
                colunaD[i] = (scanner.nextInt() - 1);
                if (colunaD[i] > 6 || colunaD[i] < 0){
                    throw new CoordenadaNavioException();
                }
            } catch(CoordenadaNavioException e) {
                do{
                    System.out.println(e.getMessage());
                    colunaD[i] = (scanner.nextInt() - 1);
                } while(colunaD[i] > 6 || colunaD[i] < 0);
            }
            ganhou(linhaD[i],colunaD[i]);
        }
    }

    public void coordenadaAvioes() throws CoordenadaNavioException{
        Scanner scanner = new Scanner(System.in);
        for (int i = (getQuant1Cano() + getQuant2Canos() + getQuant3Canos() + getQuant4Canos()); i < (getQuant1Cano() + getQuant2Canos() + getQuant3Canos() + getQuant4Canos() + getQuantAvioes());i++){
            try {
                System.out.println("Selecione a Linha do Porta-avioes #" + (i + 1) + ": ");
                linhaD[i] = (scanner.nextInt() - 1);
                if (linhaD[i] > 7 || linhaD[i] < 0){
                    throw new CoordenadaNavioException();
                }
            } catch(CoordenadaNavioException e) {
                do{
                    System.out.println(e.getMessage());
                    linhaD[i] = (scanner.nextInt() - 1);
                } while(linhaD[i] > 7 || linhaD[i] < 0);
            }



            try {
                System.out.println("Selecione a Coluna do Porta-avioes #"+ (i + 1) +": ");
                colunaD[i] = (scanner.nextInt() - 1);
                if (colunaD[i] > 7 || colunaD[i] < 0){
                    throw new CoordenadaNavioException();
                }
            } catch(CoordenadaNavioException e) {
                do{
                    System.out.println(e.getMessage());
                    colunaD[i] = (scanner.nextInt() - 1);
                } while(colunaD[i] > 7 || colunaD[i] < 0);
            }
            ganhou(linhaD[i],colunaD[i]);
        }
    }

    public void formatoNavios(Tabuleiro x) throws CoordenadaNavioException{ //falta implementar cada tipo de navio no tabuleiro e a exception
        try {

            coordenada1Cano();

            coordenada2Canos();

            coordenada3Canos();

            coordenada4Canos();

            coordenadaAvioes();

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
        } catch (CoordenadaNavioException e) {
            System.out.println(e.getMessage());
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

    public void atacarNavio(Tabuleiro x){

        Scanner scanner = new Scanner(System.in);
        //while(getQuant1Cano()!=0 || getQuant2Canos()!=0 || getQuant3Canos()!=0 || getQuant4Canos()!=0 || getQuantAvioes()!=0){
        for(int i = 0; i < 3;i++){
            System.out.println("Selecione a Linha de Ataque");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            linhaA[i] = (scanner.nextInt() - 1);
            while (linhaA[i] > 9 || linhaA[i] < 0) {
                System.out.println("Selecione uma Linha válida");
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                linhaA[i] = (scanner.nextInt() - 1);
            }
            System.out.println("Selecione a Coluna de Ataque");
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
    */
}
