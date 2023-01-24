package edu.erika.exercpoo;

public class Carro {

    String cor;
    String modelo; 
    int capacidadeTanque;

    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }
    String cor(){
        return cor;
    }

    void setMmodelo(String modelo){
       this.modelo = modelo; 
    }
    String modelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    int egtC    apacidadeTanque(){
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}
