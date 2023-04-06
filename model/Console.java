package model;

import java.util.Scanner;

public class Console {
    public static void InicioModo() throws CoordenadaNavioException, NomeInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String modoSelecionado;

        //Player player1 = new Player();
        //Player player2 = new Player();

        System.out.println("Digite 1 para modo padrao, 2 para batalha naval custom.");
        modoSelecionado = scanner.nextLine();
        if(modoSelecionado.equals("1")) {

            //BatalhaNaval gridP1 = new BatalhaNaval(player1, 4, 3, 2, 1, 1);
            //BatalhaNaval gridP2 = new BatalhaNaval(player2, 4, 3, 2, 1, 1);


            //gridP1.formatoNavios(gridP1); // metodo de defesa
            //gridP2.formatoNavios(gridP2); // metodo de defesa
            //gridP1.atacarNavio(gridP2);
            //gridP2.atacarNavio(gridP1);

        }else if(modoSelecionado.equals("2")){
            System.out.println("Digite a Quantidade de Navios de Um Cano: ");
            int a = scanner.nextInt();
            System.out.println("Digite a Quantidade de Navios de Dois Canos: ");
            int b = scanner.nextInt();
            System.out.println("Digite a Quantidade de Navios de Tres Canos: ");
            int c = scanner.nextInt();
            System.out.println("Digite a Quantidade de Navios de Quatro Canos: ");
            int d = scanner.nextInt();
            System.out.println("Digite a Quantidade de Porta-avioes: ");
            int e = scanner.nextInt();
          //  BatalhaNaval gridP1 = new BatalhaNaval(player1,a,b,c,d,e);
            //BatalhaNaval gridP2 = new BatalhaNaval(player2,a,b,c,d,e);
            //gridP1.formatoNavios(gridP1); // metodo de defesa
            //gridP2.formatoNavios(gridP2); // metodo de defesa
            //gridP1.atacarNavio(gridP2);
            //gridP2.atacarNavio(gridP1);
        } else {
            System.out.println("modo de jogo nao existente.");
        }
    }


    public static void main(String[] args) throws CoordenadaNavioException, NomeInvalidoException {
        InicioModo();
    }
}


