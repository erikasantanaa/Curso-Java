package edu.erika.exercarrays;

import java.util.Random;

import javax.xml.transform.Source;

/**
 * Gere e imprima uma matriz M 4x4 com 
 * valores aleatórios entre 0-9.
*/

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++) {
            for(int coluna = 0; coluna < matriz[i].length; coluna++){
                matriz[i][coluna] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matriz) {
            for (int elementoDaColuna : linha) {
                System.out.println(elementoDaColuna + " ");
            }  
            System.out.println();
        }   
    }
}
