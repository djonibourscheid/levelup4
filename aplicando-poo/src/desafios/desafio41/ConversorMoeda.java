package desafios.desafio41;

import java.util.Scanner;

//  Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal()
//  para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
public class ConversorMoeda implements ConversaoFinanceira {
  private double valorDoDolar;

  public double getValorDoDolar() {
    return valorDoDolar;
  }

  public void setValorDoDolar(double valorDoDolar) {
    this.valorDoDolar = valorDoDolar;
  }

  @Override
  public double converterDolarParaReal(double valor) {
    return valorDoDolar * valor;
  }


  //  Fazendo o main no mesmo arquivo para não ficar vários arquivos nos desafios
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    ConversorMoeda conversor = new ConversorMoeda();
    conversor.setValorDoDolar(4.97);

    System.out.println("Quantos dólares você quer converter? ");
    double valorParaConversao = leitura.nextDouble();

    System.out.printf("%.2f dólares em reais valem %.2f reais",
        valorParaConversao,
        conversor.converterDolarParaReal(valorParaConversao));
  }
}
