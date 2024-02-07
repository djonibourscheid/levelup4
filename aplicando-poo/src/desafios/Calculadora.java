package desafios;
import java.util.Scanner;

//  Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
public class Calculadora {
  public double dobraValor(double valor) {
    return valor*2;
  }

  //  Fazendo o main no mesmo arquivo para não ficar vários arquivos nos desafios
  public static void main(String[] args) {
    System.out.println("Digite um número e veja seu dobro:");
    double valor = new Scanner(System.in).nextDouble();

    Calculadora calculadora = new Calculadora();

    System.out.println(calculadora.dobraValor(valor));
  }
}
