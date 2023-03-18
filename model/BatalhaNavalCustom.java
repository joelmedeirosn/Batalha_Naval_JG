package model;

import java.util.Scanner;

public class BatalhaNavalCustom extends Navios{
    Player player;
    BatalhaNaval bn = new BatalhaNaval(player,4,3,2,1,1);

    public BatalhaNavalCustom(int quant1Cano, int quant2Canos, int quant3Canos, int quant4Canos, int quantAvioes) {
        super(quant1Cano, quant2Canos, quant3Canos, quant4Canos, quantAvioes);
    }

    public void custom() throws CoordenadaNavioException { //apenas apliquei a ideia, falta testar e aperfeiçoar
        Scanner scanner = new Scanner(System.in);
        setQuant1Cano(scanner.nextInt());
        setQuant2Canos(scanner.nextInt());
        setQuant3Canos(scanner.nextInt());
        setQuant4Canos(scanner.nextInt());
        setQuantAvioes(scanner.nextInt());

        bn.formatoNavios(bn);

    }
}
