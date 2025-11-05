package Service;

import model.Game;
import model.Player;

public class GameService {
    {
        System.out.println("Я загадал число От 1 до 10. Попробуй угадать!");
    }

    Player player;
    Game game;

    public GameService() {
        player = new Player();
        game = new Game();
    }

    public void start() {

        String result = "";
        while (!result.equalsIgnoreCase("угадал")) {
            System.out.println("Ваш выбор: ");
            result = game.guess(player.makeGuess());
            System.out.println(result);
        }

    }

}
