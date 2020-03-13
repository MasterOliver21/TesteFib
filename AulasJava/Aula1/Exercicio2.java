public class Exercicio2
{
    public static void main(String arg []){
        double cambio = 5.00;
        double reais = 30.00;
        double desconto;
        double dollar;
        
        if(reais >= 100 && reais < 1000){
            desconto = (cambio*5)/100;
            cambio = cambio - desconto;
            dollar = reais/cambio;
            System.out.println(dollar);
        }
        
        else if (reais >= 1000){
            desconto = (cambio*10)/100;
            cambio = cambio - desconto;
            dollar = reais/cambio;
            System.out.println(dollar);
        }
        
        else {
            dollar = reais/cambio;
            System.out.println(dollar);
        }
        
        
        
        
    }
}