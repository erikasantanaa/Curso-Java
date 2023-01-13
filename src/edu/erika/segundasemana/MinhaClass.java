package edu.erika.segundasemana;
public class MinhaClass {
    public static void main(String[] args) {

       String primeiroNome = "Érika";
       String segundoNome = "Santana";

       String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

       System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat("").concat(segundoNome);
    }
}