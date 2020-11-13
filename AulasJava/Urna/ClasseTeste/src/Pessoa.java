public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;


    public String GetNome(){
        return this.nome;
    }

    public int GetIdade(){
        return this.idade;
    }
    public String GetCpf(){
        return this.cpf;
    }

    public void SetNome(String nome){
        this.nome = nome;
    }
    public void SetIdade(int idade){
        this.idade = idade;
    }

    public void SetCpf(String cpf){
        this.cpf = cpf;
    }
    
}
