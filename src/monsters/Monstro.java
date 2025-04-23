package monsters;

abstract class Monstro {
    private String nome;
    int nivel;

    public Monstro(int nivel) {
        this.nivel = nivel;
    }

    public Monstro(String nome, int nivel) {
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
