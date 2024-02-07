package desafios;

//  Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters
//  e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe
//  um valor percentual e reduz o preço do produto.
public class Produto {
  private String nome;
  private double preco;

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public double aplicarDesconto(double percentualDesconto) {
    return this.preco - (this.preco * percentualDesconto / 100);
  }


  //  Fazendo o main no mesmo arquivo para não ficar vários arquivos nos desafios
  public static void main(String[] args) {
    Produto p1 = new Produto("Caneta", 2.99);
    System.out.printf("""
        Nome do produto: %s
        Preço: %.2f
        Preço com desconto de 10%c: %.2f""", p1.getNome(), p1.getPreco(), '%', p1.aplicarDesconto(10));
  }
}
