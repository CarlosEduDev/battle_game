import monsters.Dragon;
import monsters.Goblin;
import monsters.Monster;
import monsters.Troll;

public class CombatSystem {
    public static void main(String[] args) {
        Player player = new Player("Evan");

        Monster goblin = new Goblin("Goblin", 2);
        Monster troll = new Troll("Troll", 4);
        Monster dragon = new Dragon("Dragão", 8);

        System.out.println(player.getNome() + " derrotou um " + goblin.getNome() + " de nível " + goblin.getNivel());
        System.out.println("Goblin grita: " + goblin.rugir());
        player.derrotarMonstro(goblin);
        System.out.println("O player " + player.getNome() + " pegou " + goblin.calcularPontos() + " xp");
        System.out.println("--------------------------------------------");

        System.out.println(player.getNome() + " derrotou um " + troll.getNome() + " de nível " + troll.getNivel());
        System.out.println("Troll grita: " + troll.rugir());
        player.derrotarMonstro(troll);
        System.out.println("O player " + player.getNome() + " pegou " + troll.calcularPontos() + " xp");
        System.out.println("--------------------------------------------");

        System.out.println(player.getNome() + " derrotou um " + dragon.getNome() + " de nível " + dragon.getNivel());
        System.out.println("Dragão grita: " + dragon.rugir());
        player.derrotarMonstro(dragon);
        System.out.println("O player " + player.getNome() + " pegou " + dragon.calcularPontos() + " xp");
        System.out.println("--------------------------------------------");

        System.out.println("Pontuação final de " + player.getNome() + ": " + player.getPontuacao()); //108
    }
}