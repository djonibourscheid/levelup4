public class CatalogoDeFilmes {
  public static void main(String[] args) {
    int anoDeLancamento = 2022;
    double nota = 8.5;
    int classificacao = (int) nota/2;

    String sinopse = """
        Esse é o Search Mathc
        Filme: Top Gun: Maverick
        Ano de lançamento: %d
        Nota: %.1f
        Classificação: %d
        """.formatted(anoDeLancamento, nota, classificacao);
    System.out.println(sinopse);
  }
}