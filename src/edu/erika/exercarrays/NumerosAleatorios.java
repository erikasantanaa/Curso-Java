package edu.erika.exercarrays;

import java.util.Random;

/**
 * Faça um programa que leia 20 números inteiros aleatórios
 * (entre 0 a 100) armazene-os num vetor.
 * Ao final mostre os números e seus sucessores. 
*/

public class NumerosAleatorios {
 public static void main(String[] args) {
    Random random = new Random(); //gera n° aleatorios
    
    int[] numerosAleatorios = new int[20];
    
    for(int i = 0; i < numerosAleatorios.length ; i++) {
        int numero = random.nextInt(100);
        numerosAleatorios[i] = numero;
        
    }



    System.out.print("Numeros Aleatórios: ");
    for (int numero : numerosAleatorios) {
        System.out.println(numero + " ");
    }
    
    System.out.print("\nAntecessor dos Numeros Aleatórios: ");
    for (int numero : numerosAleatorios) {
        System.out.println((numero - 1) + " ");
    }
    
    System.out.print("\nSucessores dos Numeros Aleatórios: ");
    for (int numero : numerosAleatorios) {
        System.out.println((numero + 1) + " ");
    }


 }
}
