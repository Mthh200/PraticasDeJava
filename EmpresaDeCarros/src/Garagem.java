public class Garagem {
    Cliente cliente;
    Carro[] carros;
    int maiorValor;
    int menorValor;
    int valorTotal;

    public Garagem(Cliente cliente, Carro[] carros){
        this.cliente = cliente;
        this.carros = carros;
        
        int maiorValor=0;
        int menorValor=0;
        int valorTotal=0;
        for(Carro carro: carros){
            valorTotal += carro.valorAtual;

            if (carro.valorAtual > maiorValor){
                maiorValor = carro.valorAtual;
            }

            if (carros[0] == carro || carro.valorAtual < menorValor){
                menorValor = carro.valorAtual;
            }
        }
        this.maiorValor = maiorValor;
        this.menorValor = menorValor;
        this.valorTotal = valorTotal;
        
    }

    private double calcularMensalidade(){
        return 3_500*carros.length + 0.005*valorTotal;
    }

    private void ordenar(){
        
        int n = carros.length;
        for (int i=0; i < n; i++){
            for (int j=0; j < n; j++){
                Carro ant, suc, temp;
                
                if (j < n-1){
                    if (carros[j].valorAtual > carros[j+1].valorAtual){
                        
                        temp = carros[j+1];
                        carros[j+1] = carros[j];
                        carros[j] = temp;
                    
                    }
                }
                if (j!=0){
                    if (carros[j].valorAtual < carros[j-1].valorAtual){
                        
                        temp = carros[j-1];
                        carros[j-1] = carros[j];
                        carros[j] = temp;
                        
                    }
                }
            }
        }
    }

    public void imprimirFatura(){
        this.ordenar();

        for (Carro carro: carros){
            System.out.println(carro);
        }
        System.out.println("Valor total: "+valorTotal);
        
        System.out.println("\nCliente: "+cliente.getNome()+
                           "\nIdade: "+cliente.getIdade()+
                           "\nRenda anual: "+cliente.getRendaAnual());
                           
        System.out.println("\nValor a ser pago: "+this.calcularMensalidade());
        
    }
    
}

