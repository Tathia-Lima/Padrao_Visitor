package visitor;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirLivro(this);
    }

}
