package atividade2;

public class Venda {

    String nome;
    String pagamento;
    pacoteDeViagem pacote;
    
    
//converte um valor em dolar para real
public double converter(double valor,double cotacao){
    double resultado;
    return resultado = valor*cotacao;
}  
//mostra o valor total do pacote em dolar e real
public void mostrarTotal(double valor,double cotacao){
    System.out.println("nome: "+nome);
    System.out.println("forma de pagamento: "+pagamento);
    System.out.println("valor em reais: R$ " + String.format("%.2f",converter(valor,cotacao)));
    System.out.println("valor em dolares $ "+ String.format("%.2f",valor));
}
//get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public pacoteDeViagem getPacote() {
        return pacote;
    }

    public void setPacote(pacoteDeViagem pacote) {
        this.pacote = pacote;
    }

//construtores
    public Venda() {
    }

    public Venda(String nome, String pagamento, pacoteDeViagem pacote) {
        this.nome = nome;
        this.pagamento = pagamento;
        this.pacote = pacote;
    }

}
