package projeto.modelos;

import projeto.calculos.Calculadora;

public class Audio {
  private String nome;
  private int duracao;
  private int totalDeReproducoes;
  private int curtidas;

  public Audio(String nome, int duracao) {
    this.nome = nome;
    this.duracao = duracao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getDuracaoSegundos() {
    return duracao;
  }

  public int getTotalDeReproducoes() {
    return totalDeReproducoes;
  }

  public int getCurtidas() {
    return curtidas;
  }

  public void setTotalDeReproducoes(int totalDeReproducoes) {
    this.totalDeReproducoes = totalDeReproducoes;
  }

  public void setCurtidas(int curtidas) {
    this.curtidas = curtidas;
  }

  public String calcularTempo() {
    return Calculadora.calcularTempo(this.getDuracaoSegundos());
  }

  public void exibeFichaTecnica() {
    String mensagem = """
        ------
        Nome: %s
        Duração: %s
        Curtidas: %d
        Total de reporduções: %d
        ------
        """.formatted(this.nome,
        this.calcularTempo(),
        this.curtidas,
        this.totalDeReproducoes);

    System.out.println(mensagem);
  }

  public void escutar() {
    this.totalDeReproducoes++;
    System.out.printf("Você começou a escutar '%s'%n", this.nome);
    this.exibeFichaTecnica();
  }

  public void curtir() {
    this.curtidas++;
    System.out.printf("Curtida registrada. Agora '%s' tem %d curtidas.%n", this.nome, this.curtidas);
  }

  public void descurtir() {
    this.curtidas--;
    System.out.println("Curtida removida.");
  }
}
