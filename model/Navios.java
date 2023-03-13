package model;

public class Navios{
    private int quantAvioes; //4
    private int quant4Canos; //3
    private int quant3Canos; //2
    private int quant2Canos; //1
    private int quant1Cano; //1

    public Navios(int quant1Cano, int quant2Canos, int quant3Canos, int quant4Canos, int quantAvioes){
        this.quant1Cano = quant1Cano;
        this.quant2Canos = quant2Canos;
        this.quant3Canos = quant3Canos;
        this.quant4Canos = quant4Canos;
        this.quantAvioes = quantAvioes;

    }

    public void navioAvioes(){
        int i,j;
        for (i=0;i<=2;i++){
            for(j=0;j<=2;j++){
                if(i==0 || i>=1 && i<=2 && j==1){
                    System.out.print("P");

                } else{
                    System.out.print("□");

                }
            }
            System.out.println();
        }
    }

    public char navio(){
        return 'N';
    }

    // public void navio4Canos(){
    //     for(int i=1;i<5;i++){
    //         System.out.println("N");
    //      }
    // }

    // public void navio3Canos(){
    //     for(int i=1;i<4;i++){
    //         System.out.println("N");
    //     }
    //  }

    // public char navio2Canos(){
    //     return 'N';
    //     }


    public int getQuantAvioes() {
        return quantAvioes;
    }
    public int getQuant4Canos() {
        return quant4Canos;
    }
    public int getQuant3Canos() {
        return quant3Canos;
    }
    public int getQuant2Canos() {
        return quant2Canos;
    }
    public int getQuant1Cano() {
        return quant1Cano;
    }



}
