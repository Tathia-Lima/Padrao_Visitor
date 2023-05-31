package visitor;

public class PublicacaoVisitor implements Visitor {

    public String exibir(Publicacao publicacao) {
        return publicacao.aceitar(this);
    }

    @Override
    public String exibirLivro(Livro livro) {
        return "Livro{" +
                "titulo='" + livro.getTitulo() + '\'' +
                ", autor='" + livro.getAutor() + '\'' +
                '}';
    }

    @Override
    public String exibirRevista(Revista revista) {
        return "Revista{" +
                "titulo='" + revista.getTitulo() + '\'' +
                ", editora='" + revista.getEditora() + '\'' +
                '}';
    }

    @Override
    public String exibirJornal(Jornal jornal) {
        return "Jornal{" +
                "titulo='" + jornal.getTitulo() + '\'' +
                ", editor='" + jornal.getEditor() + '\'' +
                '}';
    }
}
