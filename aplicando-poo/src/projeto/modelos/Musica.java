package projeto.modelos;

public class Musica extends Audio{
  private String compositor;
  private String genero;

  public Musica(String nome, int duracao, String compositor, String genero) {
    super(nome, duracao);
    this.compositor = compositor;
    this.genero = genero;
  }

  public String getCompositor() {
    return compositor;
  }

  public String getGenero() {
    return genero;
  }
}
