public class Carro {

    private String Marca;

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    private String Modelo;

    public Carro(String marca, String modelo) {
        Marca = marca;
        Modelo = modelo;
    }
        public void mostrarDetalhes(){

            System.out.println("Marca do carro: " + getMarca());
            System.out.println("Modelo do carro: " + getModelo());

        }
}
