package model;

public class Console {
    public static void main(String[] args) throws CoordenadaNavioException {
        Player player1 = new Player();
        Player player2 = new Player();


        BatalhaNaval gridP1 = new BatalhaNaval(player1,0,0,0,0,1);
        BatalhaNaval gridP2 = new BatalhaNaval(player2,1,1,1,1,0);
        gridP1.formatoNavios(gridP1);
        //gridP2.defender(gridP2);
        //gridP1.atacarNavio(gridP2);
        gridP2.atacarNavio(gridP1);
    }
}
