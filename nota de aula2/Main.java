import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        chamando o objeto e o scanner
        Produto produto = new Produto();
        Scanner sc = new Scanner(System.in);

//        chamando a variaveis
        String nome;
        int codigo;
        int quantidade;
        int quantidade_vender;

//        cadastro
        System.out.println("Vamos cadastrar um produto!");
        System.out.println("Informe o codigo do produto:");
        produto.codigo=sc.nextInt();
        System.out.println("informe o nome do produto:");
        sc.nextLine();
        produto.nome= sc.nextLine();
        System.out.println("informe a quantidade do produto:");
        produto.quantidade=sc.nextInt();
        System.out.println(produto.codigo);
        System.out.println(produto.nome);
        System.out.println(produto.quantidade);

        System.out.println("Digite 01 para realizar uma venda ou 02 para encerrar o programa:");
        int escolha = sc.nextInt();

        switch (escolha){

            case 1:
                System.out.println("Quanto você deseja vender?");
                int quantidade_venda=sc.nextInt();
                produto.fazer_vendas(produto.quantidade, quantidade_venda);
                System.out.println(produto.resultado);

                break;

            case 2:
                System.out.println("encerrando o progama...");
                break;

        }


    }
}
