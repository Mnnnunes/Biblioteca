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
            livros.add(livro);
            // adicionar na lista livros
    }

     public void listarLivros() {

    for (Livro livro : livros) {
        
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());

        if (livro.isDisponivel()) {
            System.out.println("Disponibilidade: Disponível");
        } else {
            System.out.println("Disponibilidade: Indisponível");
        }
        System.out.println("-------------------");
        }
    }


    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        // adicionar na lista usuarios
    }

    public void listarUsuarios(){
    
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Limite de empréstimos: " + usuario.getLimiteEmprestimos());
            System.out.println("Prazo de devolução: " + usuario.getPrazoDevolucao() + " dias");
            System.out.println("-------------------");
        }
    }

       

            // imprimir título e autor
        
    

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