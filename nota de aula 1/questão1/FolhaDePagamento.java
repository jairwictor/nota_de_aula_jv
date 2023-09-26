package questão1;
import  java.util.Scanner;
public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String nome;
        int matricula;
        double salarioBruto;



        System.out.println("Insira a matrícula do funcionário:");
        matricula = sc.nextInt();
        System.out.println("Insira o nome completo do funcionário:");
        sc.nextLine();
        nome = sc.nextLine();
        System.out.println("Insira o salário bruto do funcionário:");
        salarioBruto = sc.nextDouble();
        System.out.println("<----------------------->");

        double deducaoInss = salarioBruto  * 0.15;
        double salarioLiquido = salarioBruto - deducaoInss;

        System.out.println("CONTRACHEQUE:");
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome completo: " + nome);
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Dedução do INSS: " + deducaoInss);
        System.out.println("Salário Liquido: " + salarioLiquido);

    }
}
