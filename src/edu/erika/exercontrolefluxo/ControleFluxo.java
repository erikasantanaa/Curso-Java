package edu.erika.exercontrolefluxo;

public class ControleFluxo {
    public static void main(String[] args) {
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }
    
    private static Void ifFlecha() {
        int mes = 9;
        if (mes == 1){
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            }
        }
    }

}
