public class Produto {
    String nome;
    int codigo;
    int quantidade;

    int quantidade_vender;

    int resultado;

    public double fazer_vendas(int quantidade, int quantidade_vender){
        resultado = quantidade - quantidade_vender;
        return resultado;

    }
 }
