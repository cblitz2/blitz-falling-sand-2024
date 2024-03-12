package blitz.fallingsand;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int width = Integer.parseInt(args[0]);
        int weight = Integer.parseInt(args[1]);
        int sandQuant = Integer.parseInt(args[2]);

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
