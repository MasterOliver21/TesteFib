
public class TestePessoa
{
    public static void main(String[] args){
       
        int x = 10;
        System.out.println(x);
        
        Pessoa p = new Pessoa();
        System.out.println(p);
        
        p.nome = "Matheus";
        p.doador = true;
        p.endereco = "Bauru";
        p.idade = 20;
      
        
        Pessoa p2 = new Pessoa();
        System.out.println(p2);
        
        p2.nome = "Johnsom";
        p2.doador = false;
        p2.endereco = "Estonia";
        p2.idade = 30;
        
        p = p2;
      
        System.out.println(p.nome + ": " + p.idade);
        System.out.println(p2.nome + ": " + p2.idade);
        
        
        
    }
}
