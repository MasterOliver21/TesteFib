import java.util.ArrayList;

public class Urna {
    //private ArrayList<Eleitor>Eleitores;
    private ArrayList<Candidato>Candidatos;
    public Urna(){
        //Eleitores = new ArrayList<Eleitor>();
        Candidatos = new ArrayList<Candidato>();
    }

    public void AddNovoCandidato(Candidato candidato){
        this.Candidatos.add(candidato);
    }

    public Boolean AddNovoVotoPresidente(Eleitor eleitor, Candidato candidato){
        Boolean encontrado = false;
        if(candidato.getCargo() == Cargo.Presidente){

        for(int i =0; i < this.Candidatos.size(); i++ ){
            if(candidato.getNumeroCadidatura() == this.Candidatos.get(i).getNumeroCadidatura()){
                encontrado = true;
                break;
            }
            encontrado = false;
        }
        if(encontrado && eleitor.GetVotoPresidente() == false){
            eleitor.SetVotoPresidente(true);
            candidato.setAdicionarVoto(true);
            return true;
        }
        else
            return false;
    }
    else
        return false;
}

    public Boolean AddNovoVotoSenador(Eleitor eleitor, Candidato candidato){
        Boolean encontrado = false;
        if(candidato.getCargo() == Cargo.Senador){

        for(int i =0; i < this.Candidatos.size(); i++ ){
            if(candidato.getNumeroCadidatura() == this.Candidatos.get(i).getNumeroCadidatura()){
                encontrado = true;
                break;
            }
            encontrado = false;
        }
        if(encontrado && eleitor.GetVotoSenador() == false){
            eleitor.SetVotoSenador(true);
            candidato.setAdicionarVoto(true);
            return true;
        }
        else
            return false;
    }
    else
        return false;
}

    public Boolean AddNovoVotoDeputado(Eleitor eleitor, Candidato candidato){
        Boolean encontrado = false;
        if(candidato.getCargo() == Cargo.Deputado){

        for(int i =0; i < this.Candidatos.size(); i++ ){
            if(candidato.getNumeroCadidatura() == this.Candidatos.get(i).getNumeroCadidatura()){
                encontrado = true;
                break;
            }
            encontrado = false;
        }
        if(encontrado && eleitor.GetVotoDeputado() == false){
            eleitor.SetVotoDeputado(true);
            candidato.setAdicionarVoto(true);
            return true;
        }
        else
            return false;
    }
    else
        return false;
}

    public int QtdTotalVotos(){
        int total = 0;
        for(int i = 0; i < Candidatos.size(); i++){
            total += Candidatos.get(i).getNumeroVotos();
        }
        return total;
    }

    public int QtdVotoPorCargo(Cargo cargo){
        int total =0;
        for(int i = 0; i < Candidatos.size(); i++){
           if(Candidatos.get(i).getCargo() == cargo){
               total += Candidatos.get(i).getNumeroVotos();
           }
        }
        return total;
    }

    public int QtdVotosCandidato(Candidato candidato){
        return candidato.getNumeroVotos();
    }
    
}
