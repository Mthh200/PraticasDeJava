public class Caixa {
    public int quantGarrafas;
    public Esteira esteira;

    public Caixa(Esteira esteira){
        this.esteira = esteira;
    }

    public void addGarrafa(){
        this.quantGarrafas++;
        System.out.println("Garrafas na caixa: "+quantGarrafas);
        this.verificar();
        
    }
    public void verificar(){
        if (quantGarrafas == 3){
            this.esteira.carregar();
            this.quantGarrafas = 0;
        }
    }
    
}
