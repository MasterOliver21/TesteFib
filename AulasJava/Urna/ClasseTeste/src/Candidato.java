public class Candidato extends Eleitor implements Candidatura {
    private int numeroCandidatura;
    private int numeroVotos;
    private Cargo cargo;


    public int getNumeroCadidatura(){
        return this.numeroCandidatura;
    }
    public Cargo getCargo(){
        return this.cargo;
    }
    public int getNumeroVotos(){
        return this.numeroVotos;
    }

    public void setNumeroCandidatura(int candidatura){
        this.numeroCandidatura = candidatura;
    }
    public void setCargo(Cargo cargo){
        this.cargo = cargo;
    }

    public void setAdicionarVoto(Boolean voto){
        if(voto)
            this.numeroVotos+=1;
    }
    
}
