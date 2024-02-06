public class CriarConta {
  public static void main(String[] args) {
    Cliente primeiroCliente = new Cliente("Djoni", "000", "dev");
    Conta primeiraConta = new Conta(119, 001, primeiroCliente);
    primeiraConta.deposita(2200);

    if (primeiraConta.deposita(50)) {
      System.out.println("Valor depositado.");
    } else {
      System.out.println("Valor inválido.");
    }

    System.out.println(primeiraConta.getSaldo());

    if (primeiraConta.saca(100)) {
      System.out.println("Valor sacado.");
    } else {
      System.out.println("Valor maior que o saldo da conta.");
    }

    System.out.println(primeiraConta.getSaldo());

    Cliente segundoCliente = new Cliente("Jão", "001", "desempregado");
    Conta segundaConta = new Conta(001, 001, segundoCliente);
    segundaConta.deposita(100);
    System.out.println("Saldo segunda conta R$" + segundaConta.getSaldo());

    if (primeiraConta.transfere(2000, segundaConta)) {
      System.out.println("A transferência foi efetuada.");
    } else {
      System.out.println("Valor a ser transferido é maior que o saldo da conta.");
    }

    System.out.println("Saldo segunda conta atualizado R$" + segundaConta.getSaldo());
    System.out.println("Saldo primeira conta atualizado R$" + primeiraConta.getSaldo());
  }
}
