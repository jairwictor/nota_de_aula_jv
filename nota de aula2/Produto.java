public class Produto {
    String nome;
    int codigo;
    int quantidade;

    int quantidade_vender;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade_vender() {
        return quantidade_vender;
    }

    public void setQuantidade_vender(int quantidade_vender) {
        this.quantidade_vender = quantidade_vender;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    int resultado;

    public double fazer_vendas(int quantidade, int quantidade_vender){
        resultado = quantidade - quantidade_vender;
        this.resultado = resultado;
        return resultado;

    }
 }
