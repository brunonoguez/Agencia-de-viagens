package atividade2;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //entrada de dados para o objeto transporte
        System.out.println("informe o tipo de transporte e o valor: ");
        String tipo = sc.nextLine();
        double valor = sc.nextDouble();
        
        //entrada de dados para o objeto hospedagem
        System.out.println("digite a descrição da hospedagem e o valor da diaria");
        sc.nextLine();
        String descricao = sc.nextLine();
        double vlrDiaria = sc.nextDouble();
        
        //entrada de dados para o objeto pacote de viagem
        System.out.println("informe o destino e a quatidade de dias");
        sc.nextLine();
        String destino = sc.nextLine();
        int dias = sc.nextInt();
        
        //criação dos objetos
        Transporte transporte = new Transporte(tipo, valor);
        Hospedagem hospedagem = new Hospedagem(descricao, vlrDiaria);
        pacoteDeViagem pacote = new pacoteDeViagem(transporte, hospedagem, destino, dias);
        pacote.mostrarDados();
        
        //mostrar o lucro
        System.out.println("\ninforme a margem de lucro(porcentagem)");
        int porcentagem = sc.nextInt();
        double totalPacote = pacote.calcularLucro(porcentagem, (pacote.calcularHospedagem() + transporte.getValor()));
        System.out.println("lucro: $ " + String.format("%.2f", totalPacote));
        
        //mostrar total do pacote
        System.out.println("\ninforme as taxas adicionais(porcentagem)");
        int taxa = sc.nextInt();
        System.out.println("total do pacote: $ " + String.format("%.2f", pacote.calcularTotalPacote(totalPacote, taxa)));
        
        //entrada de dados para o objeto venda
        System.out.println("informe o nome do cliente e o tipo de pagamento:");
        sc.nextLine();
        String nome = sc.nextLine();
        String pagamento = sc.nextLine();
        
        //ciração do objeto venda
        Venda venda = new Venda(nome, pagamento, pacote);
        
        //converte um valor em dolar para real
        System.out.println("informe o valor para converção e a cotação atual do dolar");
        double dolares = sc.nextDouble();
        double cotacao = sc.nextDouble();
        System.out.println("total convertido: R$ "+String.format("%.2f",venda.converter(dolares,cotacao)));
        
        //mostra as informações da venda
        venda.mostrarTotal(pacote.calcularTotalPacote(totalPacote, taxa), cotacao);

    }

}
