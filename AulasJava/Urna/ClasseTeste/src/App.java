import javax.swing.plaf.synth.Region;

public class App {
    public static void main(String[] args) throws Exception {

//#region Inicializações de Candidatos e eleitores
        Candidato c1 = new Candidato();
        Candidato c2 = new Candidato();
        Candidato c3 = new Candidato();
        Eleitor e1 = new Eleitor();
        Eleitor e2 = new Eleitor();
        Eleitor e3 = new Eleitor();
        Urna u = new Urna();
//#endregion
        
//#region Definindo propriedades
        c1.SetNome("Michael Obama");
        c1.setNumeroCandidatura(123456);
        c1.setCargo(Cargo.Presidente);

        c2.SetNome("Jhonson");
        c2.setNumeroCandidatura(563);
        c2.setCargo(Cargo.Deputado);

        c3.SetNome("Elvys");
        c3.setNumeroCandidatura(404);
        c3.setCargo(Cargo.Senador);

        e1.SetNome("Matheus");
        e1.SetNumeroEleitor(123546789);

        e2.SetNome("Josevalda");
        e2.SetNumeroEleitor(255);

        e2.SetNome("Marivalda");
        e2.SetNumeroEleitor(369);
//#endregion

//#region Adicionando Candidatos
       //Não há limites para add.
        u.AddNovoCandidato(c1);
        u.AddNovoCandidato(c2);
        u.AddNovoCandidato(c3);
//#endregion

//#region Votações
        //Caso Alguém for votar mais de uma vez, não funciona.
        u.AddNovoVoto(c1, c1); //Candidato 1 votando nele mesmo

        u.AddNovoVoto(c1, c2); //
        u.AddNovoVoto(c2, c3);
        u.AddNovoVoto(c3, c3);
        u.AddNovoVoto(e, c1); 
//#endregion

        System.out.println(u.QtdVotoPorCargo(Cargo.Senador));

        System.out.println(u.QtdVotosCandidato(c1));



        


    }
}
