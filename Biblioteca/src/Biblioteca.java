public class Biblioteca {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro(01, "Trono de Vidro", "Sarah"
        , "Panini", 2000);
        Livro livro2 = new Livro();

        Cliente cliente1 = new Cliente("Matheus", "(85) 91234-5678"
        , 20);

        /*
        livro1.status();
        System.out.println();
        livro2.status(); */
        
        Aluguel aluguel1 = new Aluguel(cliente1, livro1);
    
        //aluguel1.setUser("Matheus");
        aluguel1.statusAluguel();
        System.out.println();
        //livro1.status();
    }
}
