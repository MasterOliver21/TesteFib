public class Eleitor extends Pessoa{
    private int numeroTituloDeEleitor;
    private Boolean voto;

    public Eleitor(){
        this.voto = false;
    }
    public int GetNumeroTituloEleitor(){
        return this.numeroTituloDeEleitor;
    }

    public boolean GetVoto(){
        return this.voto;
    }

    public void SetNumeroEleitor(int numeroTituloDeEleitor){
        this.numeroTituloDeEleitor = numeroTituloDeEleitor;
    }
    public void SetVoto(Boolean voto){
        this.voto = voto;
        
    }
    
}
