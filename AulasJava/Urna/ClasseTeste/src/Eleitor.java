public class Eleitor extends Pessoa{
    private int numeroTituloDeEleitor;
    private Boolean votoPresidente;
    private Boolean votoSenador;
    private Boolean votoDeputado;

    public Eleitor(){
        this.votoPresidente = false;
        this.votoSenador = false;
        this.votoDeputado = false;
    }
    public int GetNumeroTituloEleitor(){
        return this.numeroTituloDeEleitor;
    }

    public boolean GetVotoPresidente(){
        return this.votoPresidente;
    }
    public boolean GetVotoSenador(){
        return this.votoSenador;
    }
    public boolean GetVotoDeputado(){
        return this.votoDeputado;
    }

    public void SetNumeroEleitor(int numeroTituloDeEleitor){
        this.numeroTituloDeEleitor = numeroTituloDeEleitor;
    }
    public void SetVotoPresidente(Boolean voto){
        this.votoPresidente = voto;
        
    }
    public void SetVotoSenador(Boolean voto){
        this.votoSenador = voto;
        
    }

    public void SetVotoDeputado(Boolean voto){
        this.votoDeputado = voto;
        
    }
    
}
