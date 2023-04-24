package model;

public class QuantidadeInvalidaException extends Exception{
    public QuantidadeInvalidaException(){
        super("Quantidade limite de navios excedida");
    }
}
