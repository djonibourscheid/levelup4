package desafios.desafio42;

import java.util.Scanner;

//  Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos
//  calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve
//  receber altura e largura como parâmetros.
public class CalculadoraSalaRetangular implements CalculoGeometrico {

  @Override
  public double calcularArea(double altura, double largura) {
    return altura * largura;
  }

  @Override
  public double calcularPerimetro(double altura, double largura) {
    return altura * 2 + largura * 2;
  }


  //  Fazendo o main no mesmo arquivo para não ficar vários arquivos nos desafios
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    CalculadoraSalaRetangular calcSalaRetangular = new CalculadoraSalaRetangular();

    System.out.println("Qual os lados do retangulo que você quer calcular?");
    System.out.println("Altura: ");
    double altura = leitura.nextDouble();
    System.out.println("Largura: ");
    double largura = leitura.nextDouble();

    System.out.printf("A sala com altura %.2f e largura %.2f tem %.2f de perimetro e %.2f de área",
        altura,
        largura,
        calcSalaRetangular.calcularPerimetro(altura, largura),
        calcSalaRetangular.calcularArea(altura, largura));
  }
}
