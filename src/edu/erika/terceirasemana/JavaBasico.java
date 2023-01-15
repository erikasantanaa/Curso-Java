package edu.erika.terceirasemana;
public class JavaBasico {
    public static void main(String[] args) {
        
        boolean variavel = true;
        variavel = !variavel;

        System.out.println(variavel);

        int a, b;
        a = 6;
        b = 6;

        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        //condição
        int numero1 = 1;
        int numero2 = 2;

       // boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }

        String nomeUm = "MARIA";
        String nomeDois = new String("MARIA");

        System.out.println(nomeUm.equals(nomeDois));

        //condições logicas
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("Fim");
    }

}
