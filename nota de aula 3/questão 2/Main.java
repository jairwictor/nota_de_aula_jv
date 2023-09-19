import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Funcionarios funcionarios = new Funcionarios();
        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos cadastrar um novo funcionário: (Digite 01 para Gerente ou 02 para Diretor)");
        int escolha = scanner.nextInt();

        switch (escolha){

            case 1:
                System.out.printf("Qual o nome do Gerente?");
                scanner.nextLine();
                gerente.setNome(scanner.nextLine());
                System.out.println("Quanto é o salário do Gerente?");
                gerente.setSalario(scanner.nextInt());
                System.out.println("Qual é o departamento do Gerente?");
                scanner.nextLine();
                gerente.setDepartamento(scanner.nextLine());
                System.out.println("---------------------------");
                System.out.println("Dados do Gerente:");
                gerente.exibir_gerente();

                break;

            case 2:
                System.out.println("Qual é o nome do Diretor?");
                scanner.nextLine();
                diretor.setNome(scanner.nextLine());
                System.out.println("Quanto é o salário do Diretor?");
                diretor.setSalario(scanner.nextInt());
                System.out.println("Qual a quantidade de ações que o Diretor possui?");
                diretor.setAcoes(scanner.nextInt());

                System.out.println("---------------------------");
                System.out.println("Dados do Diretor:");
                diretor.exibir_Diretor();

                break;
        }
  }
}
