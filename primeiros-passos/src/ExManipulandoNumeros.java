import java.util.Scanner;

public class ExManipulandoNumeros {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    //  Crie um programa que solicite ao usuário digitar um número.
    //  Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
    System.out.println("Digite um número inteiro qualquer:");
    int numeroQualquer = leitura.nextInt();

    if (numeroQualquer > 0) {
      System.out.println("O número %d é positivo".formatted(numeroQualquer));
    } else if (numeroQualquer < 0) {
      System.out.println("O número %d é negativo".formatted(numeroQualquer));
    } else {
      System.out.println("O número é 0");
    }


    System.out.println("");
    //  Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem
    //  indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
    System.out.println("Digite dois números inteiros:");
    int numero1 = leitura.nextInt();
    int numero2 = leitura.nextInt();
    if (numero1 == numero2) {
      System.out.println("Os dois números são iguais");
    } else if (numero1 > numero2) {
      System.out.println("O número %d é maior que o número 5%d".formatted(numero1, numero2));
    } else {
      System.out.println("O número %d é menor que o número %d".formatted(numero1, numero2));
    }


    System.out.println("");
    //  Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
    System.out.println("Digite um número e veja sua tabuáda");
    int numeroTabuada = leitura.nextInt();
    System.out.println("A tabuáda de %d é:".formatted(numeroTabuada));
    for (int i = 1; i < 11; i++) {
      System.out.println("%d x %d = %d".formatted(numeroTabuada, i, (numeroTabuada * i)));
    }


    System.out.println("");
    //  Crie um programa que solicite ao usuário a entrada de um número inteiro.
    //  Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
    System.out.println("Digite um número inteiro:");
    int parOuImpar = leitura.nextInt();
    if (parOuImpar % 2 == 0) {
      System.out.println("O número é par");
    } else {
      System.out.println("O número é ímpar");
    }


    System.out.println("");
    //  Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
    System.out.println("Vamos calcular o fatorial. Digite um número inteiro:");
    int numeroFatorial = leitura.nextInt();
    int calculoFatorial = numeroFatorial;

    for (int i = (numeroFatorial - 1); i > 0; i--) {
      calculoFatorial *= i;
    }
    System.out.println("O fatorial de %d é %d".formatted(numeroFatorial, calculoFatorial));
  }
}
