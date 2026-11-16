import java.util.List;
import java.util.ArrayList;

public class Biblioteca {

    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;


    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();

    }

        public void cadastrarLivro(Livro livro) {
        // adicionar na lista livros
    }

    public void cadastrarUsuario(Usuario usuario) {
        // adicionar na lista usuarios
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
            // imprimir título e autor
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {

            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            // se o título for igual, retorna o livro
            }
        }
        return null; // não achou
    }
}