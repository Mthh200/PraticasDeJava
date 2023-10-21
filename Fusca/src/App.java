public class App {
    public static void main(String[] args) throws Exception {
        /*
        Fusquinha fuscaJoao = new Fusquinha("Azul", 2000, true);
        Fusquinha fuscaCarlos = new Fusquinha("Amarelo", 2000, false);
        Fusquinha fuscaMaria = new Fusquinha("Branco", 2000, false);

        fuscaJoao.pagaMulta();
        fuscaCarlos.pagaMulta();
        fuscaMaria.recebeMulta();

        fuscaCarlos.completaAno(5);

        fuscaJoao.exibir();
        fuscaCarlos.exibir();
        fuscaMaria.exibir(); */

        NovoFusca fuscaNeymar = new NovoFusca("Verde", 1999, true, false);
        NovoFusca fuscaMessi = new NovoFusca("Vermelho", 3000, false, true);
        NovoFusca fuscaCR7 = new NovoFusca("Rosa", 1000, true, false);

        fuscaNeymar.pagaMulta();
        fuscaNeymar.completaAno(100);
        fuscaNeymar.exibir();

        fuscaMessi.tiraAr();
        fuscaCR7.botaAr();

        fuscaMessi.recebeMulta();
        fuscaCR7.pagaMulta();

        fuscaMessi.exibir();
        fuscaCR7.exibir();

    }
}
