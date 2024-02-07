import java.util.Scanner;

public class TesteFilme {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    Filme filme1 = new Filme("Baby driver", 2017, true);

    for (int i = 0; i < 5; i++) {
      System.out.println("\nDitie sua nota de avaliação:");
      double nota = leitura.nextDouble();

      if (filme1.avaliar(nota)) {
        System.out.println("Sua avaliação foi computada. Nova média de avaliações é: " + filme1.getAvaliacao());
      } else {
        System.out.println("Sua nota é inválida. Tente um número entre 0 a 10.");
      }
    }

    filme1.exibeFichaTecnica();
  }
}
