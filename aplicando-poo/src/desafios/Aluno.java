package desafios;

//  Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
//  Crie uma instância da classe Aluno, atribua valores aos seus atributos e
//  utilize o método para exibir as informações.
public class Aluno {
  private String nome;
  private int idade;

  public Aluno(java.lang.String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public void exibeInformacoes() {
    String mensagem = """
        \n-------------
        Nome: %s
        Idade: %d
        -------------
        """.formatted(this.nome, this.idade);
    System.out.println(mensagem);
  }

  //  Fazendo o main no mesmo arquivo para não ficar vários arquivos nos desafios
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Djoni", 18);
    Aluno aluno2 = new Aluno("Zé", 19);

   aluno1.exibeInformacoes();
   aluno2.exibeInformacoes();
  }
}
