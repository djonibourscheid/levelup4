public class Conta {
  private double saldo;
  private int conta;
  private int agencia;
  private Cliente titular;

  private static int totalDeContas;

  public Conta(int conta, int agencia, Cliente titular) {
    Conta.totalDeContas++;
    this.conta = conta;
    this.agencia = agencia;
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public int getConta() {
    return conta;
  }

  public int getAgencia() {
    return agencia;
  }

  public Cliente getTitular() {
    return titular;
  }

  public static int getTotalDeContas() {
      return Conta.totalDeContas;
  }


  public boolean deposita(double valor) {
    if (valor < 0) {
      return false;
    }
    this.saldo += valor;
    return true;
  }

  public boolean saca(double valor) {
    if (this.saldo < valor) {
      return false;
    }

    this.saldo -= valor;
    return true;
  }

  public boolean transfere(double valor, Conta destino) {
    if (this.saldo < valor) {
      return false;
    }

    this.saca(valor);
    destino.deposita(valor);
    return true;
  }
}
