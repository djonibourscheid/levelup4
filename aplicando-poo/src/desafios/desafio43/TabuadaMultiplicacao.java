package desafios.desafio43;

import java.util.Scanner;

//  Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada()
//  para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
public class TabuadaMultiplicacao implements Tabuada {

  @Override
  public String mostrarTabuada(int numero) {
    StringBuilder mensagem = new StringBuilder("Tabuáda do " + numero);

    for (int i = 1; i < 11; i++) {
      mensagem.append("%n%d x %d = %d".formatted(i, numero, i * numero));
    }

    return mensagem.toString();
  }


  //  Fazendo o main no mesmo arquivo para não ficar vários arquivos nos desafios
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Qual número você quer ver a tabuáda?");
    int valor = leitura.nextInt();

    System.out.println(new TabuadaMultiplicacao().mostrarTabuada(valor));
  }
}
