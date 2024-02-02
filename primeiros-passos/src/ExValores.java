public class ExValores {
  public static void main(String[] args) {
    //  Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
    //  Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
    double precoProduto = 9.73;
    int quantidade = 4;
    double precoTotal = precoProduto * quantidade;
    System.out.println("A compra de %d produtos de valor %.2f deu R$%.2f".formatted(quantidade, precoProduto, precoTotal));


    // Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
    // Considere que o valor de 1 dólar é equivalente a 4.94 reais.
    // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
    double valorEmDolares = 42.3;
    double dolarParaReal = 4.94;
    double valorEmReal = valorEmDolares * dolarParaReal;
    System.out.println("%.2f dólares valem %.2f reais na conversão de 1 dolar para %.2f reais"
        .formatted(valorEmDolares, valorEmReal, dolarParaReal));


    //  Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
    //  representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto
    //  e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
    //  Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
    double precoOriginal = 11.98;
    double percentualDesconto = 10;

    double precoDesconto = precoOriginal * (percentualDesconto / 100);
    double precoComDesconto = precoOriginal - precoDesconto;

    System.out.println("O produto que custa %.2f reais, com desconto de %.1f, fica no valor de %.2f reias"
        .formatted(precoOriginal, percentualDesconto, precoComDesconto));
  }
}

