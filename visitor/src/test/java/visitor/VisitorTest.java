package visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    public void testExibirLivro() {
        Visitor visitor = new PublicacaoVisitor();
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        String resultado = livro.aceitar(visitor);
        String esperado = "Livro{titulo='O Senhor dos Anéis', autor='J.R.R. Tolkien'}";
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testExibirRevista() {
        Visitor visitor = new PublicacaoVisitor();
        Revista revista = new Revista("Veja", "Editora Abril");
        String resultado = revista.aceitar(visitor);
        String esperado = "Revista{titulo='Veja', editora='Editora Abril'}";
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testExibirJornal() {
        Visitor visitor = new PublicacaoVisitor();
        Jornal jornal = new Jornal("The New York Times", "Editor-in-Chief");
        String resultado = jornal.aceitar(visitor);
        String esperado = "Jornal{titulo='The New York Times', editor='Editor-in-Chief'}";
        Assertions.assertEquals(esperado, resultado);
    }
}