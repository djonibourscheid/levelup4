package screenmatch.modelo;

import screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
  private String diretor;

  public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, String diretor) {
    super(nome, anoDeLancamento, incluidoNoPlano);
    this.diretor = diretor;
  }

  public void exibeFichaTecnica() {
    super.exibeFichaTecnica("Diretor", this.diretor);
  }

  @Override
  public int getClassificacao() {
    return (int) this.getAvaliacao()/2;
  }
}
