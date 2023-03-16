package model;

public class NomeInvalidoException extends Exception{
    public NomeInvalidoException(){

        super("Digite um nome entre 3 e 15 caracteres.");
    }
}
