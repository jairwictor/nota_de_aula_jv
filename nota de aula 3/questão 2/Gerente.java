public class Gerente extends Funcionarios {

    private double resultado;
    private String departamento;
    double bonus;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }



    public double calcularBonus(int salario){
        double bonus = salario * 0.10;
        double resultado = salario + bonus;
        this.resultado = resultado;
        return resultado;
    }
    public void  exibir_gerente(){
        System.out.println("Nome: " + getNome());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salário: " + calcularBonus(getSalario()));


    }
}
