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
        
//#region Definindo propriedades de Eleitores e Candidatos
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
        e1.SetNumeroEleitor(123);

        e2.SetNome("Josevalda");
        e2.SetNumeroEleitor(255);

        e2.SetNome("Marivalda");
        e2.SetNumeroEleitor(369);

        e3.SetNome("Tulio");
        e3.SetNumeroEleitor(897);
//#endregion

//#region Adicionando Candidatos
       //Não há limites para add.
        u.AddNovoCandidato(c1);
        u.AddNovoCandidato(c2);
        u.AddNovoCandidato(c3);
//#endregion

//#region Votações
        //Caso Alguém for votar mais de uma vez, não funciona.
        //c1 = Presidente, c2 = Deputado, c3 = Senador
        u.AddNovoVotoPresidente(c1, c1); //Candidato votando nele mesmo
        u.AddNovoVotoDeputado(c1, c2); //Candidato c1(Presidente) votando no deputado c2
        u.AddNovoVotoSenador(c1, c1); //Forçando um erro de voto em senador indexistente
        u.AddNovoVotoSenador(c1, c3); //c1(Presidente) votando no senador c3

        u.AddNovoVotoPresidente(e1, c1); //e1 votando para presidente c1
        u.AddNovoVotoPresidente(e1, c1); //forçando erro
        u.AddNovoVotoDeputado(e1, c2); // e1 votando no deputado c2
        u.AddNovoVotoSenador(e1, c3); //e1 votando no senador 

//#endregion

        System.out.println(u.QtdVotoPorCargo(Cargo.Presidente));
        System.out.println(u.QtdVotosCandidato(c3));
        System.out.println(u.QtdTotalVotos());



        


    }
}
