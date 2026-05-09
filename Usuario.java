public class Usuario {
    private String nome;
    private double renda;

    public Usuario(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public double getRenda() {
        return renda;
    }
}