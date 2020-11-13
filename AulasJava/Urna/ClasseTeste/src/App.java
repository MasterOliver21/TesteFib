public class App {
    public static void main(String[] args) throws Exception {

        Candidato c = new Candidato();

        c.SetNome("Michael Obama");
        c.SetCpf("000.000.000-00");
        c.SetIdade(58);
        c.setNumeroCandidatura(0000000000);
        c.setCargo(Cargo.Presidente);

        Eleitor e = new Eleitor();

        e.SetNome("Matheus");
        e.SetNumeroEleitor(123546789);

        System.out.println(c.getCargo());
    }
}
