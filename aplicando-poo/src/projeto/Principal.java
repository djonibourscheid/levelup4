package projeto;

import projeto.modelos.Musica;
import projeto.modelos.Podcast;

public class Principal {
  public static void main(String[] args) {
    Musica musica1 = new Musica("Mina do condomínio", 400, "Seu Jorge");
    Podcast podcast1 = new Podcast("Bocadinhas 52 - A Vida é Uma Festa!", 3080, "Lucas Inutilismo");
    Podcast podcast2 = new Podcast("Podcast grandção mesmo muito grande.", 4000, "Eu mesmo.");

    musica1.setCurtidas(756);
    musica1.setTotalDeReproducoes(1000);
    podcast1.setCurtidas(153);
    podcast1.setTotalDeReproducoes(200);
    podcast2.setCurtidas(3);
    podcast2.setTotalDeReproducoes(10);

    musica1.escutar();
    musica1.curtir();
    podcast1.escutar();
    podcast1.curtir();
    podcast2.escutar();
    podcast2.curtir();
  }
}
