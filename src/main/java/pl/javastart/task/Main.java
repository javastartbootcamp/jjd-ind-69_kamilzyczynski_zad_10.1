package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        GamesLibrary steam = new GamesLibrary();

        steam.addGamesToLibrary();
        System.out.println(steam);
    }
}
