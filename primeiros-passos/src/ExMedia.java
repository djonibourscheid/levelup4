public class ExMedia {
  public static void main(String[] args) {
  //  Crie um programa que realize a média de duas notas decimais e exiba o resultado.
    double nota1 = 2.8;
    double nota2 = 6.3;

    double soma = nota1 + nota2;
    double media = soma / 2;

    String mensagem = """
        A notas são: %.1f e %.1f
        A soma das notas é: %.1f
        A média das notas é: %.1f""".formatted(nota1, nota2, soma, media);

    System.out.println(mensagem);


    //  Declare uma variável do tipo double e uma variável do tipo int.
    //  Faça o casting da variável double para int e imprima o resultado.
    int mediaRedonda = (int) media;


    //  Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
    //  Atribua valores a essas variáveis e concatene-as em uma mensagem.
    char letra = 'A';
    String palavra = "arredondada";
    System.out.println(letra + " nota " + palavra + " é: " + mediaRedonda);
  }
}
