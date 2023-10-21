import java.util.Scanner;
public class Operacoes extends Livro{
    Scanner input = new Scanner(System.in);


    public void renameTitle(Livro livro){
        System.out.println("Título: "+livro.getTitle());
        System.out.print("Novo título: ");
        String newName = input.nextLine();
        livro.setTitle(newName);
        System.out.println("Ok!");
    }

}
