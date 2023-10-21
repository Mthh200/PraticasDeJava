public class Fusquinha {
    private String cor;
    private int ano;
    private boolean multado; 

    public Fusquinha(String cor, int ano, boolean multado){
        this.cor=cor;
        this.ano=ano;
        this.multado=multado;
    }

    public void exibir(){
        System.out.println();
        System.out.println("Cor: "+this.getCor());
        System.out.println("Ano: "+this.getAno());
        System.out.println("Multado: "+this.getMultado());
    }

    public void recebeMulta(){
        this.multado=true;
    }
    public void pagaMulta(){
        if (this.multado==false){
            System.out.println("Não tem multas para pagar");
        } else{this.multado=false;}
    }

    public void completaAno(){
        this.ano++;
    }
    public void completaAno(int ano){
        this.ano+=ano;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor=cor;
    }

    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano=ano;
    }

    public boolean getMultado(){
        return this.multado;
    }

}
