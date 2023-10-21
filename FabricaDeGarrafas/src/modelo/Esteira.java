import javax.swing.JOptionPane;

public class Esteira {
    public boolean estado;

    public Esteira(){
        this.estado = false;
    }

    public void ligar(){
        this.estado = true;
        JOptionPane.showMessageDialog(null, 
        "Esteira LIGADA", 
        "Notificação", 
        2);
    }
    public void desligar(){
        this.estado = false;
        JOptionPane.showMessageDialog(null, 
        "Esteira DESLIGADA", 
        "Notificação", 
        2);
    }
    public void carregar(){
        this.ligar();
        JOptionPane.showMessageDialog(null, 
        "Caminhão carregado", "Notificação", 1);
        this.desligar();
    }
}
