import java.util.Random;
import java.util.Scanner;

public class ExNumeroAleatorio {
  public static void main(String[] args) {
    //  Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
    //  e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa
    //  deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
    Scanner leitura = new Scanner(System.in);
    int numeroSorteado = new Random().nextInt(100);
    boolean ganhou = false;

    for (int tentativas = 5; tentativas > 0; tentativas--) {
      System.out.println("Você tem %d tentativas para acertar o número de 0 a 100. Digite seu palpite:".formatted(tentativas));
      int numero = leitura.nextInt();

      if (numero < 0 || numero > 100) {
        System.out.println("Número inválido. Tente um número entre 0 e 100");
        tentativas++;
      } else {
        if (numero > numeroSorteado) {
          System.out.println("O número sorteado é menor que " + numero);
        } else if (numero < numeroSorteado) {
          System.out.println("O número sorteado é maior que " + numero);
        } else {
          ganhou = true;
          break;
        }
      }
    }

    if (ganhou) {
      System.out.println("Você acertou! O número era " + numeroSorteado);
    } else {
      System.out.println("Acabou suas chances e você não acertou. O número era " + numeroSorteado);
    }
  }
}
