//Sistema de simulação de financiamentos imobiliários de um grande banco

import java.util.Scanner;

class Financiamento {   //Declarando classe de Financiamento
    double valorImovel;   //Atributos financiamento
    int prazoFinanciamento;
    double taxaJurosAnual;
    double calcularPagamentoMensal;

    Financiamento(double valorDesejadoImovel, int prazoAnoFinanciamento, double taxaJurosAnual) {   //Construtor
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoAnoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    double calcularPagamentoMensal(){    //Método de calcular pagamento mensal da classe Financiamento
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    double calcularValorTotal(){   //Método de calcular valor total da classe Financiamento
        return this.calcularPagamentoMensal * this.prazoFinanciamento * 12; //RESOLVER!!!!!

    }
}

class InterfaceUsuario {  //Declarando classe de Interface de Usuário
    private Scanner scanner;

    public InterfaceUsuario() {   //Construtor iniciando o scanner
        this.scanner = new Scanner(System.in); //Criando scanner para solicitar informação ao usuário
    }

    double pedirValorImovel() {   //Scanner pedindo o valor do imóvel ao usuário
        System.out.println("Qual é o valor do imóvel que deseja?: ");
        return scanner.nextDouble();
    }

    int pedirPrazoFinanciamento() {   //Scanner pedindo um prazo de financiamento para o usuário
        System.out.println("Qual é o prazo em anos para o financiamento?: ");
        return scanner.nextInt();
    }

    double pedirTaxaJuros() {   //Scanner pedindo uma taxa de juros para o usuário
        System.out.println("Qual seria a porcentagem da taxa de juros? ");
        return scanner.nextDouble();
    }

    void fecharScanner() {   //Fechando scanner
        scanner.close();

    }
}

public class Main {   //Declarando classe main
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        double valorImovel = interfaceUsuario.pedirValorImovel();   //Novo financiamento
        int prazoAnoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJurosAnual = interfaceUsuario.pedirTaxaJuros();
        Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoAnoFinanciamento, taxaJurosAnual);
    }
}