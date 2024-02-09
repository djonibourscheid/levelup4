package screenmatch.modelo;

public class Filme extends Titulo {
  private String diretor;

  public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, String diretor) {
    super(nome, anoDeLancamento, incluidoNoPlano);
    this.diretor = diretor;
  }

  public void exibeFichaTecnica() {
    super.exibeFichaTecnica("Diretor", this.diretor);
  }
}
