package desafios.desafio45;

public class ProdutoFisico implements Calculavel {
  private double valor;

  public void setValor(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return valor;
  }

  @Override
  public double calculaTaxa() {
    return valor * 0.10;
  }
}