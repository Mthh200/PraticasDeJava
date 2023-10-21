public class Banco {
    public static void main(String[] args) throws Exception {
        Conta contaCorrente = new Conta("Matheus");
        Conta contaPoupanca = new Conta("Mariana");

        contaCorrente.abrirConta("CC");
        contaPoupanca.abrirConta("CP");
        
        contaCorrente.dados();
        contaPoupanca.dados();

        contaCorrente.depositar(0);
        contaPoupanca.depositar(0);
        
        contaCorrente.sacar(38);
        contaPoupanca.sacar(130);

        contaCorrente.pagarMensal();
        contaPoupanca.pagarMensal();

        contaCorrente.fecharConta();
        contaPoupanca.fecharConta();

        contaCorrente.abrirConta();
        contaPoupanca.abrirConta();

        contaCorrente.dados();
        contaPoupanca.dados();

    }
}
