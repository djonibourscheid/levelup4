package projeto.calculos;

public class Calculadora {
  public static String calcularTempo(int tempoSegundos) {
    int horas = 0;
    int minutos = Math.floorDiv(tempoSegundos, 60);
    int segundos = Math.floorMod(tempoSegundos, 60);

    String mensagem = "";
    if (minutos > 60) {
      horas = Math.floorDiv(minutos, 60);
      minutos = Math.floorMod(minutos, 60);
      mensagem += horas + "h ";
    }

    mensagem += "%dm %dseg".formatted(minutos, segundos);
    return mensagem;
  }
}
