import screenmatch.modelo.Filme;
import screenmatch.modelo.Serie;

public class TestaHeranca {
  public static void main(String[] args) {
    Filme filme1 = new Filme("Nome do filme", 2002, true, "Nome do Diretor");
    filme1.exibeFichaTecnica();

    Serie serie1 = new Serie("Nome da serie", 2001, false);
    serie1.exibeFichaTecnica();
    serie1.setTemporadas(10);
    serie1.setEpisodiosPorTemporada(20);
    serie1.setMinutosPorEpisodio(30);

    System.out.println("Duração total da série: " + serie1.getDuracaoEmMinutos() + " minutos");
  }
}
