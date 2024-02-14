package projeto.modelos;

public class Podcast extends Audio {
  private String host;
  private String descricao;

  public Podcast(String nome, int duracao, String host) {
    super(nome, duracao);
    this.host = host;
  }

  public String getHost() {
    return host;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
