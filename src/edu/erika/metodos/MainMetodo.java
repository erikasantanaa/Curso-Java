package edu.erika.metodos;

/**
 * Classe principal dos exercicios CalculadoraMetodo,
 * Emprestimo, mensagem. 
*/

public class MainMetodo {
    public static void main(String[] args) {
        
        //calculadora
        System.out.println("Exercicio Calculadora");
        CalculadoraMetodo.soma(3, 6);
        CalculadoraMetodo.subtracao(9, 1.8);
        CalculadoraMetodo.multiplicacao(7, 8);
        CalculadoraMetodo.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercicio Mensagem");
        MensagemMetodo.obterMensagem(9);
        MensagemMetodo.obterMensagem(14);
        MensagemMetodo.obterMensagem(1);

        //Emprestimo

    }
}
