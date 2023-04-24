package model;

public class CoordenadaNavioException extends Exception{
    public CoordenadaNavioException(){
        super("O navio colidiu com outro previamente posicionado.");
    }
}
