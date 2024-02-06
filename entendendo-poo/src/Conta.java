public class Conta {
  double saldo;
  int conta;
  int agencia;
  String titular;


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
