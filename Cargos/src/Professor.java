public class Professor extends Pessoa{
    private String especialidade;
    private int salario;

    public void receberAumento(int novoSalario){
        this.salario=novoSalario;
        System.out.println("Novo salário confirmado");
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    
}
