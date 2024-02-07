package desafios;

import java.time.LocalDate;

//  Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a
//  ficha técnica e calcular a idade do carro.
public class Carro {
  private String modelo;
  private int ano;
  private String cor;

  public Carro(java.lang.String modelo, int ano, java.lang.String cor) {
    this.modelo = modelo;
    this.ano = ano;
    this.cor = cor;
  }

  public void calculaIdade() {
    LocalDate localDate = LocalDate.now();
    int anoAtual = localDate.getYear();

    System.out.println("A idade do carro é de " + (anoAtual - this.ano) + " anos.");
  }

  public void exibeFichaTecnica() {
    String mensagem = """
        \n-------------
        Modelo: %s
        Ano: %d
        Cor: %s
        -------------
        """.formatted(this.modelo, this.ano, this.cor);
    System.out.println(mensagem);
  }

  //  Fazendo o main no mesmo arquivo para não ficar vários arquivos nos desafios
  public static void main(String[] args) {
    Carro carro = new Carro("T-Cross", 2022, "Cinza");

    carro.calculaIdade();
    carro.exibeFichaTecnica();
  }
}
