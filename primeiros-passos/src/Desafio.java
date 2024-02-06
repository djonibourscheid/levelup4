import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    //  Intro
    String nome = "José da Silva";
    String tipoConta = "Corrente";
    double saldo = 2400;

    String boasVindas = """
        ***********************
        Dados iniciais do cliente:
                
        Nome: %s
        Tipo conta: %s
        Saldo inicial: R$ %.2f
        ***********************""".formatted(nome, tipoConta, saldo);
    System.out.println(boasVindas);


    //  Looping
    boolean cancelar = false;
    do {
      String mensagemOperacao = """
          ---------
          Operações
                  
          1- Consultar saldos
          2- Depositar valor
          3- Transferir valor
          4- Sair
                  
          Digite a opção desejada:""";
      System.out.println(mensagemOperacao);

      int opcao = leitura.nextInt();

      //  Cases
      switch (opcao) {
        case 1:
          System.out.println("Seu saldo é de R$" + saldo);
          break;

        case 2:
          boolean depositoValido = false;
          do {
            System.out.println("Informe o valor a depositar:");
            double valor = leitura.nextDouble();

            if (valor < 0) {
              System.out.println("Valor inválido. Tente novamente.");
            } else {
              depositoValido = true;
              saldo += valor;
              System.out.println("Deposito efetuado! Saldo atualizado R$ " + saldo);
            }
          } while (!depositoValido);
          break;

        case 3:
          boolean transferenciaValida = false;
          do {
            System.out.println("Informe o valor que deseja transferir:");
            double valor = leitura.nextDouble();

            if (valor < 0) {
              System.out.println("Valor inválido. Tente novamente.");
            } else if (valor > saldo) {
              System.out.println("Valor maior que o saldo em conta. Tente novamente com um valor menor.");
            } else {
              transferenciaValida = true;
              saldo -= valor;
              System.out.println("Transferência efetuada! Saldo atualizado R$ " + saldo);
            }
          } while (!transferenciaValida);
          break;

        case 4:
          cancelar = true;
          break;

        default:
          System.out.println("Operação inválida.");
          break;
      }
    } while (!cancelar);

    //  Ending
    System.out.println("Volte sempre!");
  }
}
