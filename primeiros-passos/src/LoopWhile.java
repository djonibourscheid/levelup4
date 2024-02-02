import java.util.Scanner;

public class LoopWhile {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double mediaAvaliacao = 0;
    double nota = 0;
    int quantidadeNotas = 0;

    while (nota != -1) {
      System.out.println("Diga sua avalição para o filme ou -1 para terminar o programa: ");
      nota = leitura.nextDouble();
      if (nota != -1) {
        mediaAvaliacao += nota;
        quantidadeNotas++;
      }
    }

    if (quantidadeNotas > 0) {
      System.out.println("Média de avaliações: " + mediaAvaliacao / quantidadeNotas);
    } else {
      System.out.println("Não houve nenhuma nota computada. Tente novamente.");
    }
  }
}
