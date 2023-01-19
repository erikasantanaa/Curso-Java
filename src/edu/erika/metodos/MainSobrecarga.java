package edu.erika.metodos;

public class MainSobrecarga {
    public static void main(String[] args) {
        //Quadrilátero
        System.out.println("Exercicio quadrilátero");
        QuadrilateroSobrecarga.area(3);
        QuadrilateroSobrecarga.area(5d, 5d);
        QuadrilateroSobrecarga.area(7, 8, 9);
        QuadrilateroSobrecarga.area(5f, 5f);
    }   
}
