
public class Livro { 
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private boolean disponivel;

    // Construtor da classe Livro

    public Livro(String titulo, String autor, int anoPublicacao, String genero, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.disponivel = disponivel;
    }   

//GETTERS retorna o valor do atributo
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public String getGenero(){
        return genero;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

//SETTERS altera o valor do atributo

    public void titulo(String titulo){
        this.titulo = titulo;
    }

    public void autor(String autor){
        this.autor = autor;
    }

    public void anoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
 
    public void genero(String genero){
        this.genero = genero;
    }

    public void disponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

}
