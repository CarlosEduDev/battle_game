package monsters;

public class Goblin extends Monstro{

    public Goblin(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public int calcularPontos() {
        return 0;
    }

    @Override
    public String rugir() {
        return "Grr";
    }
}









