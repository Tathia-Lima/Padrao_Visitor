package visitor;

public class Revista implements Publicacao {

    private String titulo;
    private String editora;

    public Revista(String titulo, String editora) {
        this.titulo = titulo;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirRevista(this);
    }

}
