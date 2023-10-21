public class Livro {
    private String title;
    private String author;
    private String genre;
    private boolean bought;
    private boolean read;
    private boolean favorited;


    public void Livro(String title) {
        this.setTitle(title);
    }
    public void Livro(String title, String author) {
        this.setTitle(title);
        this.setAuthor(author);
    }
    public void Livro(String title, String author, String genre) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setGenre(genre);
    }
    public void Livro (String title, String author, String genre, boolean bought) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setGenre(genre);
        this.setBought(bought);
    }   
    public void Livro(String title, String author, String genre, boolean bought, boolean read) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setGenre(genre);
        this.setBought(bought);
        this.setRead(read);
    }
    public void Livro(String title, String author, String genre, boolean bought, boolean read, boolean favorited) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setGenre(genre);
        this.setBought(bought);
        this.setRead(read);
        this.setFavorited(favorited);
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public boolean isBought() {
        return bought;
    }
    public void setBought(boolean bought) {
        this.bought = bought;
    }
    public boolean isRead() {
        return read;
    }
    public void setRead(boolean read) {
        this.read = read;
    }
    public boolean isFavorited() {
            return favorited;
        }
    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }
}
