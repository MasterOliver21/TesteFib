
package app;

public class Cpf {
    String cpf_digitado;
    private char newCpf[];
    private int digitos[] = new int[12];
    private int v1 , v2, v3, v4;
    private boolean verificador = true;


    public boolean validade(String cpf){

        newCpf = cpf.toCharArray();
        for(int i = 0; i < 11; i++){

           digitos[i] = Character.getNumericValue(newCpf[i]);
        }
        int x = digitos[0];
        for(int i = 1; i < 10; i++)
        {
            
            if(digitos[i] != x){
                verificador = false;
                break;
            }
        }

        if(verificador == true){
            return false;
        }
        else{
                        //123.456.789-10
                            //1               //2              //3             //4              //5              //6              //7              //8               //9      
                v1 = (digitos[0] * 10 + digitos[1] * 9 + digitos[2] * 8 + digitos[3] * 7 + digitos[4] * 6 + digitos[5] * 5 + digitos[6] * 4 + digitos[7] * 3 + digitos[8] * 2);
                v2 = (v1 * 10)%11; //Primeiro Digito
                v3 = (digitos[0] * 11 + digitos[1] * 10 + digitos[2] * 9 + digitos[3] * 8 + digitos[4] * 7 + digitos[5] * 6 + digitos[6] * 5 + digitos[7] * 4 + digitos[8] * 3 + digitos[9] * 2);
                v4 = (v3 * 10)%11; // Segundo digito
                     if(v2 == digitos[9] && v4 == digitos[10]){
                            return true;
                        }

                    else{
                            return false;
                    }
             }
        
    }

    
}