public class Diretor extends Funcionarios {

    private int acoes;

    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }
    public void  exibir_Diretor(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("porcentagem de ações possuidas: " + getAcoes());


    }

}
