package desafios;

//  Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado),
//  saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.
public class ContaBancaria {
  private int numeroConta;
  private double saldo;
  public String titular;

  public ContaBancaria(int numeroConta, String titular) {
    this.numeroConta = numeroConta;
    this.titular = titular;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public boolean deposita(double valor) {
    if (valor < 0) {
      return false;
    }
    this.saldo += valor;
    return true;
  }

  public boolean saca(double valor) {
    if (valor < 0) {
      return false;
    }
    this.saldo -= valor;
    return true;
  }


  //  Fazendo o main no mesmo arquivo para não ficar vários arquivos nos desafios
  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria(001, "Djoni");
    System.out.println("Conta n° " + conta.getNumeroConta());

    if (conta.deposita(500)) {
      System.out.println("Valor depositado com sucesso. Saldo atual é de R$ " + conta.getSaldo());
    } else {
      System.out.println("Valor inválido. Tente novamente.");
    }

    if (conta.saca(50)) {
      System.out.println("Valor sacado com sucesso. Saldo atual é de R$ " + conta.getSaldo());
    } else {
      System.out.println("Valor inválido. Tente novamente.");
    }
  }
}
