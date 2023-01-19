package edu.erika.metodos;

/**
 * Crie uma aplicação que calcule a área dos 3 quadriláteros
 * notáveis: quadrado, retângulo e trapézio.
 * obs: use sobrecarga.
*/

public class QuadrilateroSobrecarga {
    public static void area(double lado) {
        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio: " + ((baseMaior+baseMenor) * altura / 2));
    }

    public static void area(Float diagonal1, Float diagonal2) {
        System.out.println("Área do retângulo: " + (diagonal1 * diagonal2) / 2);
    }
}
