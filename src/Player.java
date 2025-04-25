import monsters.Monster;

public class Player {
    private final String nome;
    private int pontuacao;

    public Player(String nome) {
        this.nome = nome;
    }

    public void derrotarMonstro(Monster monster){
        pontuacao += monster.calcularPontos();
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getNome() {
        return nome;
    }
}
