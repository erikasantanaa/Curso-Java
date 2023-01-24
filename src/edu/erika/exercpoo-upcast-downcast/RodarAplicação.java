package edu.erika.exercpoo-upcast-downcast;

public class RodarAplicação {
    public static void main(String[] args) {
        
        //pegar uma classe e estanciar o objeto dela
        Funcionario funcionario = new Funcionario();

        //Upcast (subtipo da class)
        Funcionario gerente = new Gerente();
        Funcionario vedendor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast - Evitar na poo
        Vendedor vendedor = (Vendedor) new Funcionario();
    }
}
