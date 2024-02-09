package screenmatch.calculo;

import screenmatch.modelo.Titulo;

public class Calculadora {
  private int minutosTotal;
  private double tempoHoras;

  public int getMinutosTotal() {
    return minutosTotal;
  }

  public double getTempoHoras() {
    return (double) minutosTotal / 60;
  }

  public void incluiDuracao(Titulo t) {
    minutosTotal += t.getDuracaoEmMinutos();
  }
}
