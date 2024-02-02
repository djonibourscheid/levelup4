import java.util.Scanner;

public class Leitura {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite seu filme favorito:");
    String filme = leitura.nextLine();

    System.out.println("E qual o ano de lançamento?");
    int lancamento = leitura.nextInt();

    System.out.println("Qual sua avalição pro filme?");
    double avaliacao = leitura.nextDouble();

    System.out.println("Bacana! O filme " + filme + " foi lançado em " + lancamento + " e sua avaliação é " + avaliacao);
  }
}
