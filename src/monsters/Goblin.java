package monsters;

public class Goblin extends Monster {

    public Goblin(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public int calcularPontos() {
        int pontos = Multiplicador.calcularPontuacao(getNivel(), Multiplicador.GOBLIN);
        return pontos;
    }

    @Override
    public String rugir() {
        return "Grruuuhh";
    }
}









