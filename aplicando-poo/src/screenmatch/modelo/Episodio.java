package screenmatch.modelo;

import screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
  int numero;
  private String nome;
  private Serie serie;
  private int totalDeViews;

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Serie getSerie() {
    return serie;
  }

  public void setSerie(Serie serie) {
    this.serie = serie;
  }

  public int getTotalDeViews() {
    return totalDeViews;
  }

  public void setTotalDeViews(int totalDeViews) {
    this.totalDeViews = totalDeViews;
  }

  @Override
  public int getClassificacao() {
    if (totalDeViews > 100) {
      return 4;
    } else if (totalDeViews > 25) {
      return 2;
    } else {
      return 0;
    }
  }
}