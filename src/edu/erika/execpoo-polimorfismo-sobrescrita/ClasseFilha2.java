package edu.erika.execpoo-polimorfismo-sobrescrita;

public class ClassFilha2 extends ClasseMae {
    
    @Override
    void metodo1() {
        System.out.println("método e da classe 2");
    }

    @Override
    void metodo2() {
        System.out.println("Método 2 da classe 2");
    }
}
