package screenmatch.modelo;

import java.util.Arrays;

public abstract class Titulo {
  private String nome;
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private double avaliacao;
  private double somaDasAvaliacoes;
  private int quantidadeAvaliacoes;
  private int duracaoEmMinutos;

  public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano) {
    this.nome = nome;
    this.anoDeLancamento = anoDeLancamento;
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public java.lang.String getNome() {
    return nome;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public boolean isIncluidoNoPlano() {
    return incluidoNoPlano;
  }

  public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public double getAvaliacao() {
    return avaliacao;
  }

  private void setAvaliacao(double avaliacao) {
    this.avaliacao = avaliacao;
  }

  public int getDuracaoEmMinutos() {
    return duracaoEmMinutos;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public boolean avaliar(double nota) {
    if (nota < 0 || nota > 10) {
      return false;
    }

    this.quantidadeAvaliacoes++;
    this.somaDasAvaliacoes += nota;

    double novaAvaliacao = this.somaDasAvaliacoes / this.quantidadeAvaliacoes;
    this.setAvaliacao(novaAvaliacao);

    return true;
  }

  public void exibeFichaTecnica(String... args) {
    String mensagem = """
        %n-------------
        Nome do título: %s
        Ano de lançamento do filme: %d
        Média das avaliações: %.1f
        Quantidade de avaliações: %d
        Extras: %s
        -------------
        """.formatted(this.getNome(), this.getAnoDeLancamento(), this.getAvaliacao(), this.quantidadeAvaliacoes, Arrays.toString(args));
    System.out.println(mensagem);
  }
}
