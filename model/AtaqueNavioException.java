package model;

public class AtaqueNavioException extends Exception{
    public AtaqueNavioException(){
        super("Você já atacou esta célula, ataque uma célula válida");
    }
}
