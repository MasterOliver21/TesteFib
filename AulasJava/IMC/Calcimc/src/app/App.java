package app;

public class App {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.nome = "João Godofredo";
        p1.altura = 1.85;
        p1.peso = 90.0;

        System.out.println(p1.risco(p1.valorImc()));


    }
}