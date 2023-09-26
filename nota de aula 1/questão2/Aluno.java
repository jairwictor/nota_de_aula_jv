package questão2;

public class Aluno {
    double soma;
    double total;

    public void notas(double nota1, double nota2, double nota3) {
        soma = nota1 + nota2 + nota3;
        total= soma / 3;
    }
}
