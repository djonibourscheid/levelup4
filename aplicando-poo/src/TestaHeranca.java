import screenmatch.calculo.Calculadora;
import screenmatch.modelo.Filme;
import screenmatch.modelo.Serie;
import screenmatch.modelo.Titulo;

import java.util.Arrays;

public class TestaHeranca {
  public static void main(String[] args) {
    Filme filme1 = new Filme("Nome do filme", 2002, true, "Nome do Diretor");
    filme1.setDuracaoEmMinutos(100);
    filme1.exibeFichaTecnica();

    Serie serie1 = new Serie("Nome da serie", 2001, false);
    serie1.exibeFichaTecnica();
    serie1.setTemporadas(10);
    serie1.setEpisodiosPorTemporada(20);
    serie1.setMinutosPorEpisodio(30);

    System.out.println("Duração total da série: " + serie1.getDuracaoEmMinutos() + " minutos");

    Filme filme2 = new Filme("Avatar", 1500, false, "sla");
    filme2.setDuracaoEmMinutos(230);


    Calculadora calculadora = new Calculadora();
    for (Titulo titulo : Arrays.asList(filme1, filme2, serie1)) {
      calculadora.incluiDuracao(titulo);
    }

    System.out.printf("Duração total é de %d minutos (%.1f horas)", calculadora.getMinutosTotal(), calculadora.getTempoHoras());
    }
  }
