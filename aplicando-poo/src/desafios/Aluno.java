package desafios;

import java.util.Arrays;

//  Desafio 1:
//  Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
//  Crie uma instância da classe Aluno, atribua valores aos seus atributos e
//  utilize o método para exibir as informações.

//  Desafio 2:
//  Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos
//  getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia
//  que retorna a média das notas do aluno.
public class Aluno {
  private String nome;
  private int idade;
  private int[] notas;

  public Aluno(String nome, int idade, int[] notas) {
    this.nome = nome;
    this.idade = idade;
    this.notas = notas;
  }

  public double mediaNotas() {
    double somaDeNotas = 0;
    int quantidadeDeNotas = 0;

    for (int nota : this.notas) {
      somaDeNotas += nota;
      quantidadeDeNotas++;
    }

    return somaDeNotas / quantidadeDeNotas;
  }

  public void exibeInformacoes() {
    String notasString = Arrays.toString(this.notas);

    String mensagem = """
        %n-------------
        Nome: %s
        Idade: %d
        Notas: %s
        Media: %.1f
        -------------""".formatted(this.nome, this.idade, notasString, this.mediaNotas());

    System.out.println(mensagem);
  }


  //  Fazendo o main no mesmo arquivo para não ficar vários arquivos nos desafios
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Djoni", 18, new int[]{0, 5, 10});
    Aluno aluno2 = new Aluno("Zé", 19, new int[]{5, 10, 8});

    aluno1.exibeInformacoes();
    aluno2.exibeInformacoes();
  }
}
