public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;
    
    private String alert = "Notificação: ";
    private boolean newConta;

    public Conta(String dono) {
        this.dono=dono;
        this.saldo=0;
        this.status=false;
        this.newConta=true;
    }

    public void dados(){
        System.out.println();
        System.out.println("==========Dados da conta==========");
        System.out.println();
        System.out.println("Número da conta: "+this.getNumConta());
        if (this.getTipo()=="CC"){
            System.out.println("Tipo de conta: Conta Corrente");
        } else if (this.getTipo()=="CP"){
            System.out.println("Tipo de conta: Conta Poupança");
        } else{
            System.out.println("Tipo de conta: Indefinido");
        }
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        if (this.getStatus()==true){
            System.out.println("Status da conta: Aberta");
        } else{ 
            System.out.println("Status da conta: Fechada");
        }
        System.out.println();
    }

    public void abrirConta(){
        if (this.status==false && newConta==false){
            this.status=true;
            System.out.println(alert+"Conta aberta");
        } else{
            System.out.println(alert+"Esta conta já está aberta ou ainda não foi criada");
        }
    }
    public void abrirConta(String tipo){
        if (this.status==false && newConta==true){
            if (tipo=="CP"){
                this.newConta=false;
                this.status=true;
                this.tipo=tipo;
                this.saldo+=150;
                System.out.println(alert+"Conta aberta");
            } else if(tipo=="CC"){
                this.newConta=false;
                this.status=true;
                this.tipo=tipo;
                this.saldo+=50;
                System.out.println(alert+"Conta aberta");
            } else{
                System.out.println(alert+"Esse não é um tipo de conta válido");
            }
        } else{
            System.out.println(alert+"Esta conta já foi criada");
        }
    }
    public void fecharConta(){
        if (this.status==true){
            if (this.saldo==0){
                this.status=false;
                System.out.println(alert+"Conta fechada");
            } else{
                System.out.println(alert+"Erro ao fechar a conta. Certifique-se de que não tem saldo na conta ou não há dívidas");
            }
        } else{ 
            System.out.println(alert+"Esta conta já está fechada");
        }
    }

    public void depositar(int deposito){
        if (this.status==true){
            this.saldo+=deposito;
            System.out.println(alert+"Depósito realizado");
        } else{
            System.out.println(alert+"Não é possivel fazer um depósito em uma conta fechada");
        }
    }
    public void sacar(int saque){
        if (this.status==true ){
            if (this.saldo>=saque){
                this.saldo-=saque;
                System.out.println(alert+"Saque realizado");
            } else{
                System.out.println(alert+"Saldo insuficiente");
            }
        } else{
            System.out.println(alert+"Não é possível fazer um saque em uma conta fechada");
        }
    }

    public void pagarMensal(){
        if(this.status==true){
            if (this.tipo=="CP"){
                this.saldo-=20;
                System.out.println(alert+"Mensalidade paga");
            } else{
                this.saldo-=12;
                System.out.println(alert+"Mensalidade paga");
            } 
        } else{
            System.out.println(alert+"Abra a conta primeiro!");
        }
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }


}
