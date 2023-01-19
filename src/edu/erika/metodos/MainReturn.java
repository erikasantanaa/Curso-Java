package edu.erika.metodos;
/**
 * refazer com returno 
*/
public class MainReturn {
    public static void main(String[] args) {
        System.out.println("Exercicios retornos");

        double areaQuadrado = ReturnMetodos.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = ReturnMetodos.area(5, 5);
        System.out.println("Área do Retangulo: " + areaRetangulo);

        double areaTrapezio = ReturnMetodos.area(7, 8, 9);
        System.out.println("Área do Trapezio: " + areaTrapezio);
    }

    
}
