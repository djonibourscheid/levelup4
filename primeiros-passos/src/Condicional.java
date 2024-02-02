public class Condicional {
  public static void main(String[] args) {
    int anoDeLancamento = 2022;
    boolean incluidoNoPlano = true;
    String tipoDoPlano = "pro";

    if (anoDeLancamento >= 2022) {
      System.out.println("Lançado recentemente.");
    }

    if (incluidoNoPlano || tipoDoPlano.equals("plus")) {
      System.out.println("Filme liberado.");
    } else {
      System.out.println("Deve pagar a locação.");
    }
  }
}
