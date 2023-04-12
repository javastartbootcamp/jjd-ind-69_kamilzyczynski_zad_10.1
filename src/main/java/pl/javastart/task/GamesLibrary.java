package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class GamesLibrary {
    private Game[] games = new Game[3];
    private int gamesCounter = 0;

    void addGamesToLibrary() {
        do {
            Game game = createGame();
            if (isUnique(game)) {
                games[gamesCounter] = game;
                gamesCounter++;
            }
        } while (gamesCounter < games.length);
    }

    private boolean isUnique(Game game) {
        for (int i = 0; i < gamesCounter; i++) {
            if (games[i].equals(game)) {
                System.out.println("Duplikat");
                return false;
            }
        }
        return true;
    }

    private Game createGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę gry");
        String name = scanner.nextLine();
        System.out.println("Podaj cenę");
        double price = scanner.nextDouble();
        scanner.nextLine();
        return new Game(name, price);
    }

    @Override
    public String toString() {
        return "Obiekty zapisane w tablicy: \n" + Arrays.toString(games);
    }
}
