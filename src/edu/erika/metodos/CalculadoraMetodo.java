package edu.erika.metodos;

/**
 * Calcule as 4 operações básicas: soma, subtração, multiplicação
 * e divisão. Sempre 2 valores devem ser passados. 
*/

public class CalculadoraMetodo {

    public static void soma(double numero1, double numero2) {
        
        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é = " + resultado);
       
    }

    public static void subtracao(double numero1, double numero2) {
        
        double resultado = numero1 - numero2;

        System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é = " + resultado);
       
    }

    public static void multiplicacao(double numero1, double numero2) {
        
        double resultado = numero1 * numero2;

        System.out.println("A multiplicacao de " + numero1 + " multiplicado " + numero2 + " é = " + resultado);
       
    }

    public static void divisao(double numero1, double numero2) {
        
        double resultado = numero1 / numero2;

        System.out.println("A divisao de " + numero1 + " dividido " + numero2 + " é = " + resultado);
       
    }
}
