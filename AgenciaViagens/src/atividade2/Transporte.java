
package atividade2;


public class Transporte {
    String tipo;
    double valor;
//construtores
    public Transporte() {
    }

    public Transporte(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
//get e set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
