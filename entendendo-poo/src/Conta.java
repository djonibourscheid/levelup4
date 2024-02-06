public class Conta {
  private double saldo;
  private int conta;
  private int agencia;
  private Cliente titular;

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public int getConta() {
    return conta;
  }

  public void setConta(int conta) {
    this.conta = conta;
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
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
