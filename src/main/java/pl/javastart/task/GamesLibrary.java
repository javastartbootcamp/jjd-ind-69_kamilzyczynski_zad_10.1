package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class GamesLibrary {
    Game[] games = new Game[3];

    void addGamesToLibrary() {
        int gamesCounter = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Podaj nazwę gry");
            String name = scanner.nextLine();
            System.out.println("Podaj cenę");
            double price = scanner.nextDouble();
            scanner.nextLine();
            Game game = new Game(name, price);
            boolean isGameDuplicated = false;
            for (int i = 0; i < gamesCounter; i++) {
                if (games[i].equals(game)) {
                    System.out.println("Duplikat");
                    isGameDuplicated = true;
                    break;
                }
            }
            if (!isGameDuplicated) {
                games[gamesCounter] = game;
                gamesCounter++;
            }
        } while (gamesCounter < games.length);
    }

    @Override
    public String toString() {
        return "Obiekty zapisane w tablicy: \n" + Arrays.toString(games);
    }
}
