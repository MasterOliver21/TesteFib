package app;

public class Pessoa{
    String nome;
    double peso;
    double altura;




public double valorImc(){
    return peso / (altura * altura);
}

public String risco(double valorImc){
    if(valorImc < 18.5 ){
        return ("Déficit de massa corporal\nRisco: Baixo(podendo ter outras doenças)");
    }
    else if(valorImc >= 18.5 && valorImc <= 24.9){
        return ("Massa corporal normal\nRisco: Normal");
    }
    else if(valorImc >= 25 && valorImc <= 29.9){
        return "Sobre peso\nRisco: Elevado";
    }

    else if(valorImc >= 30 && valorImc <= 34.9){
        return "Obesidade leve\nRisco: Alto";
    }
    else if(valorImc >= 35 && valorImc <= 39.9){
        return "Obesidade media\nRisco: Muito Alto";
    }
    else {
        return "Obesidade mórbida\nRisco: Iminente";
    }

}


}