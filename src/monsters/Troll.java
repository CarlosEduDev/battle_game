package monsters;

public class Troll extends Monster {
    public Troll(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public int calcularPontos() {
        int pontos = Multiplicador.calcularPontuacao(getNivel(), Multiplicador.TROLL);
        return pontos;
    }

    @Override
    public String rugir() {
        return "AAGGGHRR";
    }
}
