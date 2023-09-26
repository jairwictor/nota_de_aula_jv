package questão3;
import java.util.Scanner;
public class Calculadora {
    double soma;
    double subtracao;
    double divisao;
    double multiplicacao;

    public double somar(double num1, double num2) {
        soma = num1 + num2;
        return soma;
    }
    public double subtrair(double num1, double num2) {
        subtracao = num1 - num2;
        return subtracao;
    }
    public double dividir(double num1, double num2) {
        divisao = num1 / num2;
        return divisao;
    }
    public double multiplicar(double num1, double num2) {
        multiplicacao = num1 * num2;
        return multiplicacao;
    }


}
