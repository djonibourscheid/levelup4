public class TestaBanco {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setNome("Djoni");
    cliente.setCpf("000.000.000-00");
    cliente.setProfissao("Dev");

    Conta conta = new Conta();
    conta.deposita(100);
    conta.setTitular(cliente);

    System.out.println(conta.getTitular().getNome());
  }
}
