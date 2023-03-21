package model;

import java.util.Scanner;

public class BatalhaNavalCustom extends BatalhaNaval{
    Player player;
    BatalhaNaval bn = new BatalhaNaval(player,4,3,2,1,1);

    public BatalhaNavalCustom(Player player,int quant1Cano, int quant2Canos, int quant3Canos, int quant4Canos, int quantAvioes) {
        super(player ,quant1Cano, quant2Canos, quant3Canos, quant4Canos, quantAvioes);
    }

    public void custom() throws CoordenadaNavioException { //apenas apliquei a ideia, falta testar e aperfeiçoar
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a quantidade Navios de 1 Cano:");
        setQuant1Cano(scanner.nextInt());
        System.out.println("Selecione a quantidade Navios de 2 Canos:");
        setQuant2Canos(scanner.nextInt());
        System.out.println("Selecione a quantidade Navios de 3 Canos:");
        setQuant3Canos(scanner.nextInt());
        System.out.println("Selecione a quantidade Navios de 4 Canos:");
        setQuant4Canos(scanner.nextInt());
        System.out.println("Selecione a quantidade Navios de Porta-Aviões:");
        setQuantAvioes(scanner.nextInt());

        bn.formatoNavios(bn);


    }
}
