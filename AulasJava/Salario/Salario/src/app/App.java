package app;

public class App {
    public static void main(String[] args) throws Exception {
        Salario salario = new Salario();

        salario.horas_trab = 30;
        salario.pessoas_dep = 2;
        salario.salario_hora = 30;

        System.out.println("Salario bruto: " + salario.SalarioBruto());
        System.out.println("Calculo do INSS: " + salario.CalcInss());
        System.out.println("Calculo IR: " + salario.CalcIr());
        System.out.println("Salario Liquido: " + salario.SalarioLiquido());

    }
}