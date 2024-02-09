import screenmatch.calculo.FiltroRecomendacao;
import screenmatch.modelo.Episodio;
import screenmatch.modelo.Filme;
import screenmatch.modelo.Serie;

import java.util.Scanner;

public class TesteFilme {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    FiltroRecomendacao filtro = new FiltroRecomendacao();

    Filme filme1 = new Filme("Baby driver", 2017, true, "diretor");

    System.out.println("Avaliando o filme " + filme1.getNome());
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
    filtro.filtra(filme1);


    Serie serie = new Serie("O Gambito da Rainha", 2000, true);
    System.out.println("Avaliando a serie " + serie.getNome());
    for (int i = 0; i < 5; i++) {
      System.out.println("\nDitie sua nota de avaliação:");
      double nota = leitura.nextDouble();

      if (serie.avaliar(nota)) {
        System.out.println("Sua avaliação foi computada. Nova média de avaliações é: " + serie.getAvaliacao());
      } else {
        System.out.println("Sua nota é inválida. Tente um número entre 0 a 10.");
      }
    }
    filtro.filtra(serie);


    Episodio episodio = new Episodio();
    episodio.setNumero(1);
    episodio.setSerie(serie);
    episodio.setTotalDeViews(100);
    System.out.printf("O episódio N°%d é: ",episodio.getNumero());
    filtro.filtra(episodio);
  }
}
