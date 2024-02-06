public class CriarConta {
  public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 2200;

    if (primeiraConta.deposita(50)) {
      System.out.println("Valor depositado.");
    } else {
      System.out.println("Valor inválido.");
    }

    System.out.println(primeiraConta.saldo);

    if (primeiraConta.saca(100)) {
      System.out.println("Valor sacado.");
    } else {
      System.out.println("Valor maior que o saldo da conta.");
    }

    System.out.println(primeiraConta.saldo);


    Conta segundaConta = new Conta();
    segundaConta.saldo = 100;
    System.out.println("Saldo segunda conta R$"+segundaConta.saldo);

    if (primeiraConta.transfere(2000, segundaConta)) {
      System.out.println("A transferência foi efetuada.");
    } else {
      System.out.println("Valor a ser transferido é maior que o saldo da conta.");
    }

    System.out.println("Saldo segunda conta atualizado R$"+segundaConta.saldo);
    System.out.println("Saldo primeira conta atualizado R$"+primeiraConta.saldo);
  }
}
