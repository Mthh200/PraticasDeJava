public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    

    public Lutador(String nome, String nacionalidade, int idade, float altura
    , float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    public void apresentar(){
        System.out.println("Lutador: "+getNome());
        System.out.println("Origem: "+getNacionalidade());
        System.out.println("Idade: "+getIdade());
        System.out.println("Altura: "+getAltura());
        System.out.println("Peso: "+getPeso());
        System.out.println("Vitórias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());

    }
    public void status(){
        System.out.println("Nome: "+getNome());
        System.out.println("Peso "+getCategoria());
        System.out.println("Vitórias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();

    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (peso<52.2f) {
            this.categoria = "Inválido";
        } else if (peso<10.3f) {
            this.categoria = "Leve";
        } else if (peso<83.9) {
            this.categoria = "Médio";
        } else if (peso<120) {
        this.categoria = "Pesado";
        } else {this.categoria = "Inválido";}
        }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    
}