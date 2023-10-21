
public class Carro {
    String marca;
    String modelo;
    String cor;
    int valorAtual;

    public Carro(String marca, String modelo, String cor, int valorAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.valorAtual = valorAtual;
    }
    


    public String toString(){
        return  "===================="+
                "\nMarca: "+ this.marca+
                "\nModelo: "+ this.modelo+
                "\nCor: "+ this.cor+
                "\nValor Atual: "+ this.valorAtual+
                "\n====================\n";
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCor() {
        return cor;
    }
    public int getValorAtual() {
        return valorAtual;
    }

    
}

