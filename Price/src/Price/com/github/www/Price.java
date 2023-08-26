package Price.com.github.www;
import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
      /** Chama a Classe Scanner */
        Scanner price = new Scanner(System.in);

      /** Captura os Dados de Entrada */
        System.out.println();
        System.out.println("**************** CALCULADORA DE PRESTAÇÕES ****************");
        System.out.println();
        System.out.print("Digite o Valor Financiado em (R$): ");
        float valorFinanciado = price.nextFloat();
        System.out.print("Digite o Valor da Entrada em (R$): ");
        float valorEntrada = price.nextFloat();
        System.out.print("Digite o Custo Efetivo Total em (%): ");
        float txJuros = price.nextFloat();
        System.out.print("Digite a Quantidade de Prestações: ");
        int numeroPrestacoes = price.nextInt();

        /** Faz o Calculo */
        float valorCorrigido = valorFinanciado - valorEntrada;
        double taxaJurosPorcentagem = txJuros / 100;
        double taxaJurosCorrigida = taxaJurosPorcentagem + 1;
        double valorPrestacoes = (double) ((Math.pow(taxaJurosCorrigida, numeroPrestacoes)) * taxaJurosPorcentagem) / ((Math.pow(taxaJurosCorrigida, numeroPrestacoes)) - 1) * valorCorrigido;
        double valorTotal = valorPrestacoes * numeroPrestacoes;

        /** Printa na Tela */
        System.out.println();
        System.out.println("**************** RESULTADO ****************");
        System.out.println();
        System.out.println("O Valor Financiado é: " + valorFinanciado + " R$");
        System.out.println("O Valor da Entrada é: " + valorEntrada + " R$");
        System.out.println("A Quantidade de Prestações são: " + numeroPrestacoes);
        System.out.println("O Valor Final c/ Juros são: " + valorTotal + " R$");
        System.out.println("O valor das prestações são: " + valorPrestacoes + " R$");
        System.out.println();
        System.out.println("**************** PAULO HENRIQUE AZEVEDO DO NASCIMENTO ****************");
    }
}
