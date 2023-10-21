public class Principal {
    public static void main(String[] args) {
        Esteira esteira = new Esteira();
        Caixa caixa = new Caixa(esteira);

        esteira.ligar();
        esteira.desligar();
/*
        caixa.addGarrafa();
        caixa.addGarrafa();
        caixa.addGarrafa();
        caixa.addGarrafa();
        caixa.addGarrafa();
        caixa.addGarrafa();
*/
    }
}
