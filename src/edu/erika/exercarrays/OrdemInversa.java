package edu.erika.exercarrays;

/**
 * Crie um vetor de 6 números inteiros
 * e mostre-os na ordem inversa.
 * 
*/

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetorOrdemInversa = {-5, -6, 15, 50, 8, 4};

        System.out.print("vetorOrdemInversa: ");
        int count = 0 ;
        while(count < (vetorOrdemInversa.length)) {
            System.out.print(vetorOrdemInversa[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetorOrdemInversa.length - 1); i >= 0; i--){
            System.out.print(vetorOrdemInversa[i] + " ");
        }
    }
}
