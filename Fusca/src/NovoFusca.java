public class NovoFusca extends Fusquinha{
    private boolean arCondicionado;

    public NovoFusca(String cor, int ano, boolean multado, boolean arCondicionado) {
        super(cor, ano, multado);
        this.arCondicionado=arCondicionado;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Ar-condicionado: "+this.arCondicionado);
    }

    public void botaAr(){
        this.arCondicionado=true;
    }
    public void tiraAr(){
        this.arCondicionado=false;
    }
    
}
