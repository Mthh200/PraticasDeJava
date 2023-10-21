public class Livro {
    private int isbn;
    private String title;
    private String autor;
    private String edit;
    private int ypublic;

    public Livro() {
        isbn=00;
        title="<vazio>";
        autor="<vazio>";
        edit="<vazio>";
        ypublic=2023;
    }
    public Livro(int isbn, String title, String autor, String edit, int ypublic) {
        this.isbn = isbn;
        this.title = title;
        this.autor = autor;
        this.edit = edit;
        this.ypublic = ypublic;
    }

    public void status() {
        System.out.println("Informações do livro: "+this.title);
        System.out.println("ISBN (Código): "+this.isbn);
        System.out.println("Título: "+this.title);
        System.out.println("Autor(a): "+this.autor);
        System.out.println("Editora: "+this.edit);
        System.out.println("Publicação: "+this.ypublic);
    }

    
    public int getIsbn () {
        return this.isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn=isbn;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title=title;
    }

    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor=autor;
    }

    public String getEdit() {
        return this.edit;
    }
    public void setEdit(String edit) {
        this.edit=edit;
    }

    public int getYPublic() {
        return this.ypublic;
    }
    public void setYPublic(int ypublic) {
        this.ypublic=ypublic;
    }
}
