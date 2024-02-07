package desafios;

//  Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters
//  para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a
//  pessoa é maior de idade ou não.
public class IdadePessoa {
  private final String nome;
  private final int idade;

  public IdadePessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public boolean maiorDeIdade() {
    return (this.idade>=18);
  }


  //  Fazendo o main no mesmo arquivo para não ficar vários arquivos nos desafios
  public static void main(String[] args) {
    IdadePessoa pessoa1 = new IdadePessoa("Djoni", 18);
    System.out.printf("""
        Nome: %s
        Idade: %d
        Maior de idade: %b""", pessoa1.getNome(), pessoa1.getIdade(), pessoa1.maiorDeIdade());

    IdadePessoa pessoa2 = new IdadePessoa("Zé", 15);
    System.out.printf("""
        %nNome: %s
        Idade: %d
        Maior de idade: %b""", pessoa2.getNome(), pessoa2.getIdade(), pessoa2.maiorDeIdade());
  }
}
