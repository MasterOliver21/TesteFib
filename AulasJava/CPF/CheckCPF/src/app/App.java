package app;

public class App {
    public static void main(final String[] args) {
        
        Cpf cpf = new Cpf();

        cpf.cpf_digitado = "00000000000"; //digitar o CPF sem pontos e hifen

        if(cpf.validade(cpf.cpf_digitado)){
            System.out.println("CPF VALIDO!");
        }
        else{
            System.out.println("CPF INVALIDO!");
        }

       
       



        
    }
}