import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    // cria um arraylist de livros emprestados para cada usuario...
    private List<Livro> livrosEmprestados;
    private int limiteEmprestimos;
    private int prazoDevolucao;

  public Usuario(String nome) {
    this.nome = nome;
    this.livrosEmprestados = new ArrayList<>();
    this.limiteEmprestimos = 3;
    this.prazoDevolucao = 15;
}

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public int getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLimiteEmprestimos(int limiteEmprestimos) {
        this.limiteEmprestimos = limiteEmprestimos;
    }

    public void setPrazoDevolucao(int prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }
}