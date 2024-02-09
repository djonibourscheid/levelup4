package desafios.desafio45;

public class CalculadoraPrecoTotal {
  private double taxaTotal;

  public void calculaTaxaTotal(Calculavel calculavel) {
    System.out.println("Somando R$ " + calculavel.calculaTaxa());
    taxaTotal += calculavel.calculaTaxa();
  }

  public double getTaxaTotal() {
    return taxaTotal;
  }
}
