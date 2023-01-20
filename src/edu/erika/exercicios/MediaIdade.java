package edu.erika.exercicios;

import java.util.Scanner;

/**
 * Faça um programa que peça para 3 pessoas a sua idade,
 * ao final o programa deverá verificar se a média de idade
 * da turma varia entre 0 e 25,
 * 26 e 60 e  maior que 60. E então , dizer se a turma é
 * jovem, adulta ou idosa, conforme a média calculada.
*/

public class MediaIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a sua idade: ");
        int idade1 = scan.nextInt();
        int idade2 = scan.nextInt();
        int idade3 = scan.nextInt();
        
      if(idade1 <= 25 && idade2 <= 25 && idade3 <= 25) {
        System.out.println("Jovem!");
      } else if (idade1 <= 60 && idade2 <= 60 && idade3 <= 60) {
        System.out.println("Adulta!");
      } else {
        System.out.println("Idosa!");
      }
      
    }
}
