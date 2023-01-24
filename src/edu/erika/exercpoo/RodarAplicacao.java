package edu.erika.exercpoo;

public class RodarAplicacao {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setCor("Rosa");
        carro1.setMmodelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getMoledo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapaciadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new carro(Cor:"Preto", modelo:"Mercedez-Benz Classe c", capacidadeTanque: 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}
