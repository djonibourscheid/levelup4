package desafios.desafio45;

public class Principal {
  public static void main(String[] args) {
    Livro livro = new Livro();
    ProdutoFisico pf = new ProdutoFisico();
    CalculadoraPrecoTotal cpt = new CalculadoraPrecoTotal();

    livro.setValor(50.2);
    pf.setValor(89.99);

    cpt.calculaTaxaTotal(livro);
    cpt.calculaTaxaTotal(pf);

    System.out.printf("O preço total das taxas dos produtos foi de %.2f", cpt.getTaxaTotal());
  }
}
