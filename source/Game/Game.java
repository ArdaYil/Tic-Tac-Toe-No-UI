import java.util.Scanner;

public class Game {
    private static Scanner keyboard = new Scanner(System.in);

    private String[][] config = {
        {"players", ""};
        {"difficulty", ""};
    };

    public void setConfig(config) {
        while (true) {
            System.out.println("Enter");
            if (!this[config]) continue;


        }
    }

    public void configGame() {
        setConfig();
    }
}