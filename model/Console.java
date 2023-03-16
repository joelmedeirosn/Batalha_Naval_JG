package model;

public class Console {
    public static void main(String[] args) throws CoordenadaNavioException {
        Player player1 = new Player();
        Player player2 = new Player();
        //player1.setPlayerName();
        //player2.setPlayerName();
        Tabuleiro gridP1 = new Tabuleiro(player1,1,1,1,1,0);
        Tabuleiro gridP2 = new Tabuleiro(player2,1,1,1,1,0); //avioes definido como zero pois falta implementa-lo.
        gridP1.defender(gridP1);
        //gridP2.defender(gridP2);
        //gridP1.atacarNavio(gridP2);
        gridP2.atacarNavio(gridP1);
    }
    //falta implementar o navio porta avioes para printar no tabuleiro.
}
