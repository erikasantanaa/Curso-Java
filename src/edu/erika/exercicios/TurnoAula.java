package edu.erika.exercicios;
import java.util.Scanner;

/**
 * Faça um Programa que pergunte em que turno você estuda. 
 * Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
 * Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!"
 * ou "Valor Inválido!", conforme o caso.
*/

public class TurnoAula {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu turno: M para Matutino, V para Vespertino ou N para Noturno: ");
        char turno = leitor.next().toUpperCase().charAt(0);

        if(turno == 'M') {
            System.out.println("Bom dia!");
        } else if (turno == 'V') {
            System.out.println("Boa tarde!");
        } else if(turno == 'N'){
            System.out.println("Boa noite!");
        }else {
            System.out.println("Valor Inválído!l");
        }
    }
}
