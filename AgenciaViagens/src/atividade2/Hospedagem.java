
package atividade2;


public class Hospedagem {
    String descricao;
    double valorDiaria;
    
    //construtores
    public Hospedagem(String descricao, double valorDiaria) {
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }

    public Hospedagem() {
    }
    //get e set
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
 
}
