package app;

public class Salario {

        int horas_trab;
        double salario_hora;
        int pessoas_dep;
        private double salario_bruto;
        private double inss;
        private double ir;


    public double SalarioBruto(){
        return ((this.horas_trab * this.salario_hora) + pessoas_dep);
    }

    public double CalcInss(){
        if(this.SalarioBruto() > 1000){
            return (SalarioBruto()*9)/100;
        }
        else{
            return (SalarioBruto()*8.5)/100;
        }
    }

    public double CalcIr(){
        if(SalarioBruto() < 500){
            return 0;
        }
        else if(SalarioBruto() > 500 && SalarioBruto() <= 1000){
            double result = (SalarioBruto()*5)/100;
            return result;
        }
        else{
            double result = (SalarioBruto()*7)/100;
            return result;
        }
    }

    public double SalarioLiquido(){
        return (SalarioBruto() - CalcIr() - CalcInss());
    }

}