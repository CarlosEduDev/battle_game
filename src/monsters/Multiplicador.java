package monsters;

public final class Multiplicador {
    public static final int GOBLIN = 2;
    public static final int TROLL = 6;
    public static final int DRAGON = 10;

    public static int calcularPontuacao(int base, int multiplicador){
        return base * multiplicador;
    }
}
