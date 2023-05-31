package visitor;

public class Jornal implements Publicacao {

    private String titulo;
    private String editor;

    public Jornal(String titulo, String editor) {
        this.titulo = titulo;
        this.editor = editor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditor() {
        return editor;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirJornal(this);
    }

}
