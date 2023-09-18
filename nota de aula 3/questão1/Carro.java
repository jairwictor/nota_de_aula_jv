public class Carro {


    String marca;
    String modelo;
    int ano_fabricacao;
    int numPortas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void exibir_Dcarro() {
        System.out.println("Marca do carro: " + getMarca());
        System.out.println("Modelo do carro: " + getModelo());
        System.out.println("Ano de fabricação: " + getAno_fabricacao());
        System.out.println("Quantidade de portas: " + getNumPortas());
    }
}
