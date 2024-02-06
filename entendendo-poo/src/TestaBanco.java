public class TestaBanco {
  public static void main(String[] args) {
    Cliente cliente = new Cliente("Djoni", "000.000.000-00", "Dev");

    Conta conta = new Conta(116, 01, cliente);
    conta.deposita(100);

    System.out.println(conta.getTitular().getNome());
    System.out.println(conta.getAgencia());
  }
}
