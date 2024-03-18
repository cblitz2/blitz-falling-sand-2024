package blitz.fallingsand;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        new SandFrame().setVisible(true);
        int width = 50;
        int height = 10;
        int sandQuant = 50;

        Scanner scanner = new Scanner(System.in);
        Sand sand = new Sand(width, height, new Random());

        sand.randomSand(sandQuant);
        System.out.println("Press Enter to make the sand fall or type 'exit' to quit ");

        while (true) {
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }
            sand.fall();
            System.out.println(sand);
        }
    }
}
