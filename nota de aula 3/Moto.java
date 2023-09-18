public class Moto {

    String marca;
    String modelo;
    int ano_fabricacao;
    int cilindradas;

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

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public void exibir_Dmoto(){
        System.out.println("Marca da moto: "+ getMarca());
        System.out.println("Modelo da moto: " + getModelo());
        System.out.println("Ano de fabricação: " + getAno_fabricacao());
        System.out.println("Quantas cilindradas possui: " + getCilindradas());
    }
}
