package app;

public class App {
    public static void main(final String[] args) {
        
        Pessoa p = new Pessoa();
        p.nome = "João Silva";
        p.idade = 36;
        p.cpf_digitado = "48209477889"; //digitar o CPF sem pontos e hifen

        if(p.validade(p.cpf_digitado)){
            System.out.println("Senhor(a): " + p.nome + " \nIdade: " + p.idade + " \nTem seu CPF valido!");
        }
        else{
            System.out.println("Senhor(a): " + p.nome + " \nIdade: " + p.idade + " \nTem seu CPF invalido!");
        }

       
       



        
    }
}