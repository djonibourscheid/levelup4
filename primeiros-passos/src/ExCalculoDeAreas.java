import java.util.Scanner;

public class ExCalculoDeAreas {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    //  Crie um menu que oferece duas opções ao usuário:
    //  "1. Calcular área do quadrado" e "2. Calcular área do círculo".
    //  Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
    System.out.println("""
        Cálculo de áreas:
        1. Calcular área do quadrado
        2. Calcular área do círculo
                
        Digite sua opção:""");

    int opcao = leitura.nextInt();
    switch (opcao) {
      case 1:
        System.out.println("Qual o lado do quadrado?");
        double ladoQuadrado = leitura.nextDouble();
        double contaQuadrado = Math.pow(ladoQuadrado, 2);
        System.out.println("A área do quadrado de lado %.2f é %.2f".formatted(ladoQuadrado, contaQuadrado));
        break;

      case 2:
        System.out.println("Qual o raio do círculo?");
        double raioCirculo = leitura.nextDouble();
        double contaCirculo = Math.PI * Math.pow(raioCirculo,2);
        System.out.println("A área do círculo de raio %.2f é %.2f".formatted(raioCirculo, contaCirculo));
        break;

      default:
        System.out.println("Opção inválida. Tente novamente.");
        break;
    }
  }
}
