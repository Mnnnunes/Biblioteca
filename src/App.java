public class App {
    public static void main(String[] args) {
    //Adicionando livors a biblioteca.
    Biblioteca biblioteca = new Biblioteca();
    biblioteca.cadastrarLivro(new Livro("Crime castigo", "Fiódor Dostoiévski", 1866, "romance psicológico", true));
    biblioteca.cadastrarLivro(new Livro("carta do diabo ao seu aprendiz", "C.S. Lewis", 1942, "Ficção", true));

    //Adicionando usuarios a biblioteca.
    
    biblioteca.cadastrarUsuario(new Usuario("Mateus"));
    biblioteca.cadastrarUsuario(new Usuario("Ana"));
    
    
    
    
    Livro encontrado = biblioteca.buscarLivroPorTitulo("Materia escura");

    if (encontrado != null) {
            System.out.println("Disponivel: " + encontrado.getTitulo() + " Autor: " + encontrado.getAutor());
      } else {
         System.out.println("Livro indisponível ");

      }
     
    }
}
     
