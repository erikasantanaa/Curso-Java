package edu.erika.argumentos;

public class AboutMe {
    public static void main(String[] args) {
        
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.print("Olá, me chamo " + nome + " " + sobrenome);
        System.out.print("Tenho " + idade + " anos ");
        System.out.print("Minha altura é " + altura + "cm ");
    }
}
