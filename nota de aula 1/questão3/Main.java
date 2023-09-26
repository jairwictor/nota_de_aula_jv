package questão3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("CALCULADORA");
        int x;
        do {
            System.out.println("Qual operação deseja usar? ");
            System.out.println("(1)Somar");
            System.out.println("(2)Subtrair");
            System.out.println("(3)Dividir");
            System.out.println("(4)Multiplicar");
            Scanner sc = new Scanner(System.in);
            int escolha = sc.nextInt();

            System.out.println("Digite dois numeros para usar na operação: ");
            Scanner num = new Scanner(System.in);


            int n1 = num.nextInt();
            int n2 = num.nextInt();

            switch(escolha) {
                case 1:
                    calculadora.somar(n1, n2);
                    System.out.println(calculadora.soma);
                    break;
                case 2:
                    calculadora.subtrair(n1, n2);
                    System.out.println(calculadora.subtracao);
                    break;
                case 3:
                    calculadora.dividir(n1, n2);
                    System.out.println(calculadora.divisao);
                    break;
                case 4:
                    calculadora.multiplicar(n1, n2);
                    System.out.println(calculadora.multiplicacao);
                    break;
                default:
                    System.out.println("Digite uma operação válida!!");
                    break;
            }
            System.out.println("Digite 0 para ver novamente!");
            x = num.nextInt();
        } while (x == 0);



    }
}
