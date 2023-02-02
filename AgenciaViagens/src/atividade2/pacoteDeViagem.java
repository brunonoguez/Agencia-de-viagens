
package atividade2;


public class pacoteDeViagem {
    Transporte transporte;
    Hospedagem hospedagem;
    String destino;
    int dias;
    
//mostra os dados da classe
public void mostrarDados(){
    System.out.println("transporte: "+transporte.getTipo());
    System.out.println("valor do transporte: $"+String.format("%.2f",transporte.getValor()));
    System.out.println("hopedagem: "+hospedagem.getDescricao());
    System.out.println("valor da diaria: $"+String.format("%.2f", hospedagem.getValorDiaria()));
    System.out.println("destino :"+destino);
    System.out.println("quantidade de dias: "+dias);
    System.out.println( "total de hospedagem: $"+String.format("%.2f",calcularHospedagem()));
}
//mostra o total de hospedagens
public double calcularHospedagem(){
    return hospedagem.getValorDiaria() * dias;
}
//calcula o lucro
public double calcularLucro(int porcentagem,double valor){
    double lucro = valor * porcentagem / 100;
    return lucro + valor;        
}
//calcula o total do pacote de viagem
public double calcularTotalPacote(double valor,double taxas){
     taxas = valor * taxas / 100;
     return valor + taxas;
}
//construtores
    public pacoteDeViagem(Transporte transporte, Hospedagem hospedagem, String destino, int dias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.dias = dias;
    }

    public pacoteDeViagem() {
    }
//get e set
    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    
}
