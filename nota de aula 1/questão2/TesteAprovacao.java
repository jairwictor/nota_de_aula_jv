package questão2;
import java.util.Scanner;

public class TesteAprovacao {
    public static void main(String[] args) {

        Aluno student = new Aluno();
        Scanner QA = new Scanner(System.in);
        double nota1, nota2, nota3;
        System.out.println("vamos analisar se o aluno está aprovado ou reprovado");
        System.out.println("Digite o nome do aluno:");
        QA.next();
        System.out.println("Digite a primeira nota:");
        nota1=QA.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2=QA.nextDouble();
        System.out.println("Digite a terceira nota:");
        nota3=QA.nextDouble();

        student.notas(nota1, nota2, nota3);

        if (student.total >= 7){
            System.out.println("O aluno está aprovado");
        }
        else {
            System.out.println("O aluno está reprovado");
        }
    }
}
