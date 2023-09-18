import java.util.Scanner;
public class Veiculos {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Moto moto = new Moto();
        Scanner sc = new Scanner(System.in);

        String exibicao;
        String marca;
        String modelo;
        int ano_fabricacao;

//   Não entendi se era pra cadastrar ou não, então achei melhor fazer cadastrando e usando switch case.

        System.out.println("Cadastre o Veículo!");
        System.out.println("para cadastrar um carro digite 01 para cadastrar uma moto digite 02:");
        int escolha_cadastro = sc.nextInt();

        switch (escolha_cadastro){

            case 1:
                System.out.println("informe a marca do Carro:");
                carro.setMarca(sc.next());
                System.out.println("informe o modelo do Carro:");
                carro.setModelo(sc.next());
                System.out.println("informe o ano de fabricação do Carro:");
                carro.setAno_fabricacao(sc.nextInt());
                System.out.println("informe a quantidade de portas do carro:");
                carro.setNumPortas(sc.nextInt());

                break;

            case 2:
                System.out.println("informe a marca da Moto:");
                moto.setMarca(sc.next());
                System.out.println("informe o modelo da Moto:");
                moto.setModelo(sc.next());
                System.out.println("informe o ano de fabriação da Moto:");
                moto.setAno_fabricacao(sc.nextInt());
                System.out.println("informe quantas cilindradas a moto possui:");
                moto.setCilindradas(sc.nextInt());

                break;
        }

        System.out.println("Deseja ver os detalhes de veículo? sim(digite se for moto ou carro), se não (Digite 'Não')");
        exibicao=sc.next();
         if ( exibicao.equals("carro")  ) {
             carro.exibir_Dcarro();

        }else if (exibicao.equals("moto")){
             moto.exibir_Dmoto();
        }else {
             System.out.println("encerrando progama...");
         }
    }
}
