public class Usuario {

    private String nome;
    private String livrosEmprestados;
    private int limiteEmprestimos;
    private int prazoDevolucao;
    
    public Usuario(String nome, String livrosEmprestados, int limiteEmprestimos, int prazoDevolucao) {
        this.nome = nome;
        this.livrosEmprestados = livrosEmprestados;
        this.limiteEmprestimos = limiteEmprestimos;
        this.prazoDevolucao = prazoDevolucao;
    }
    
    public String getNome() {
        return nome;
    }
    public String getLivrosEmprestados() {
        return livrosEmprestados;
    }
    public int getlimiteEmprestimos() {
        return limiteEmprestimos;
    }
    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setLivrosEmprestados(String livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
    public void setlimiteEmprestimos(int limiteEmprestimos) {
        this.limiteEmprestimos = limiteEmprestimos;
    }
    public void setPrazoDevolucao(int prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }

}