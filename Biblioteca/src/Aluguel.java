
public class Aluguel {
    private Cliente cliente;
    private Livro livro;

    public Aluguel(Cliente cliente, Livro livro) {
        this.setCliente(cliente);
        this.setLivro(livro);
    }

    public Livro getLivro(){
        return this.livro;
    }
    public void setLivro(Livro livro){
        this.livro=livro;
    }

    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }

    public void statusAluguel() {
        System.out.println("Usuário: "+this.cliente.getNome());
        this.livro.status();
    }

}
