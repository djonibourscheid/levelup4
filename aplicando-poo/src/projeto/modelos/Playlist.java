package projeto.modelos;

import projeto.calculos.Calculadora;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
  private int duracaoTotal;
  private List<Audio> reproducao = new ArrayList<>();
  private int quantidadeAudios;

  public int getQuantidadeAudios() {
    return quantidadeAudios;
  }

  public List<Audio> getReproducao() {
    return reproducao;
  }

  public String calcularTempo() {
    return Calculadora.calcularTempo(duracaoTotal);
  }

  public void addAudio(Audio audio) {
    reproducao.add(audio);
    duracaoTotal += audio.getDuracaoSegundos();
    quantidadeAudios++;

    System.out.printf("'%s' foi adicionado na lista de reprodução. %d itens na lista.%n",
        audio.getNome(), this.quantidadeAudios);
  }

  public void removeAudio(Audio audio) {
    reproducao.remove(audio);
    quantidadeAudios--;

    System.out.printf("'%s' foi removido da lista de reprodução. %d itens restantes.%n",
        audio.getNome(), this.quantidadeAudios);
  }

  public String exibeFichaTecnica() {
    String mensagem = """
        -------
        Duração total da lista de reprodução é de %s
        Há %s itens na lista de reprodução.
        -------
        """.formatted(this.calcularTempo(), this.getQuantidadeAudios());

    return mensagem;
  }

  public void escutar() {
    System.out.printf("%nVocê começou a escutar sua lista de reprodução.%n");
    System.out.println(this.exibeFichaTecnica());

    for (Audio audio : reproducao) {
      audio.escutar();
    }

    System.out.println("Fim da sua lista de reprodução.");
  }
}
