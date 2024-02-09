package desafios.desafio45;

//  Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas
//  classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
public class Livro implements Calculavel{
  private double valor;

  public void setValor(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return valor;
  }

  @Override
  public double calculaTaxa() {
    return 5;
  }
}
