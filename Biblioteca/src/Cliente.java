public class Cliente {
    private String nome;
    private String celular;
    private int idade;

    public Cliente(String nome, String celular, int idade) {
        this.setNome(nome);;
        this.setCelular(celular);;
        this.setIdade(idade);;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
