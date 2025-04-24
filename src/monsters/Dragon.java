package monsters;

public class Dragon extends Monster{
    public Dragon(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public int calcularPontos() {
        int pontos = Multiplicador.calcularPontuacao(getNivel(), Multiplicador.DRAGON);
        return pontos;
    }

    @Override
    public String rugir() {
        return "Guurrhh";
    }
}
