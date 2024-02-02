public class ExConversaoTemperaturas {
  public static void main(String[] args) {
    double celsius = 33.2;
    double fahrenheit = (celsius * 1.8) + 32;
    int fahrenheitInt = (int) fahrenheit;

    String mensagem = """
        Temperatura em Celsius: %.1f
        Temperatura em Fahrenheit: %.1f
        Temperatura em Fahrenheit inteira: %d"""
        .formatted(celsius, fahrenheit, fahrenheitInt);

    System.out.println(mensagem);
  }
}
