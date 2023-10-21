import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(){

    }

    public void marcarLuta(Lutador desafiado, Lutador desafiante){
        if (desafiado.getCategoria().equals(desafiante.getCategoria())
        && desafiante!=desafiado){
            this.setAprovada(true);
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }

    }
    public void lutar(){
        if (this.isAprovada()){
            System.out.println("DESAFIADO: ");
            desafiado.apresentar();
            System.out.println();
            System.out.println("DESAFIANTE:");
            desafiante.apresentar();
            System.out.println();

            Random random = new Random();
            int vencedor = random.nextInt(3);

            switch (vencedor){
                case 0: //Empate
                    System.out.println("Empate!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: //Desafiado ganhou
                    System.out.println("Vitória do "+desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: //Desafiante ganhou
                    System.out.println("Vitória do "+desafiante.getNome());
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        } else{
            System.out.println("Luta não pode acontecer");
        }

    }


    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    

}

