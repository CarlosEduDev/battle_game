package monsters;

abstract public class Monster {
    private String nome;
    private int nivel;

    public Monster(int nivel) {
        this.nivel = nivel;
    }

    public Monster(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public abstract int calcularPontos();

    public abstract String rugir();
}
