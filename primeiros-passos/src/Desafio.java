import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    //  Intro
    String nome = "José da Silva";
    double saldo = 2400;

    String boasVindas = """
        ***********************
        Dados iniciais do cliente:
                
        Nome: %s
        Tipo conta: Corrente
        Saldo inicial: R$ %.2f
        ***********************""".formatted(nome, saldo);
    System.out.println(boasVindas);


    //  Looping
    boolean cancelar = false;
    do {
      String mensagemOperacao = """
                  
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
          System.out.println("Consultar saldos");
          break;
        case 2:
          System.out.println("Depositar valor");
          break;
        case 3:
          System.out.println("Transferir valor");
          break;
        case 4:
          System.out.println("Sair");
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
