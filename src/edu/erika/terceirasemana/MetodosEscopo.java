package edu.erika.terceirasemana;

public class MetodosEscopo {
    public static void main(String[] args) {
      //tipos de metodos  
    }

    public double somar(int num1, int num2) {
        //logica - finalidade do metodo
        return ...;
    }

    public void imprimir(String texto) {
        //Logica - finalidade do método
        //Aqui não precisa de return
        // Pois não será retornado nenhum resultado
    }

    public double dividir(int dividendo, int divisor) throws Exception {
        //Indica que o metodo ao ser utilizado poderá gerar uma exceção
    }

    private void metodoPrivado() {
        //este metodo não pode ser visto por outras classes
    }

    public void validar() {
        //este metodo poderia retornar algum valor boolean
    }

    public void calcularEnviar() {
        //um metodo deve representar uma única resposta
    }

    public void gravarCliente() {
        //este metodo tem a finalidade de gravar
        //informações de um cliente, por que não criar um objeto cliente e
        //passar como parâmetro? ver abaixo
    }

    public void gravarCliente(Cliente cliente) {
        
    } //ou

    public void gravar(Cliente cliente ) {
        
    }
}
