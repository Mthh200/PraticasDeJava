public class Bolsista extends Aluno {
    private int bolsa;

    public void renovarBolsa(){
        System.out.println("Bolsa do bolsista renovada");
    }

    @Override
    public void pagarMens(){
        System.out.println("Mensalidade do bolsista foi facilitada");
    }

    public int getBolsa() {
        return bolsa;
    }
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    

}
