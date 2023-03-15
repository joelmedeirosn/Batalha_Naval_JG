package model;

public class CoordenadaNavioException extends Exception{
    public CoordenadaNavioException(){
        super("Digite uma coordenada valida para posicionar o navio.");
    }
}
