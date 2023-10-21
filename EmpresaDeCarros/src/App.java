public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cli1 = new Cliente();
        cli1.setNome("Guilherme Yoda Wayne");
        cli1.setIdade(31);
        cli1.setRendaAnual(240_000);
        
        Carro car1 = new Carro("Marca", "Modelo", "Cor", 300_000);
        Carro car2 = new Carro("Marca", "Modelo", "Cor", 400_000);
        Carro car3 = new Carro("Marca", "Modelo", "Cor", 700_000);
        Carro car4 = new Carro("Marca", "Modelo", "Cor", 150_000);
        Carro car5 = new Carro("Marca", "Modelo", "Cor", 550_000);
        
        Carro[] carros = {car1, car2, car3, car4, car5};
        Garagem gar1 = new Garagem(cli1, carros);
        
        gar1.imprimirFatura();
        
        /*
        for (Carro carros2 : carros) {
            System.out.println(carros2); 
        } 
        
        int[] vetor = {4, 3, 2, 1};
        int n = vetor.length;
        
        for (int i=0; i < n; i++){
            for (int j=0; j < n; j++){
                int ant, suc, temp;
                
                if (j < n-1){
                    if (vetor[j] > vetor[j+1]){
                        
                        temp = vetor[j+1];
                        vetor[j+1] = vetor[j];
                        vetor[j] = temp;
                    
                    }
                }
                if (j!=0){
                    if (vetor[j] < vetor[j-1]){
                        
                        temp = vetor[j-1];
                        vetor[j-1] = vetor[j];
                        vetor[j] = temp;
                    }
                }
            }
        } */

    }
}


