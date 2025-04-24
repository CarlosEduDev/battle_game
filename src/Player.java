import monsters.Monster;
import monsters.Multiplicador;

public class Player {
    private final String nome;
    private int pontuacao;

    public Player(String nome) {
        this.nome = nome;
    }

    public void derrotarMonstro(Monster monster){
        pontuacao = monster.getNivel() * monster.calcularPontos();
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getNome() {
        return nome;
    }
}
