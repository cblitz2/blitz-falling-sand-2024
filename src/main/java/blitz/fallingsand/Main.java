package blitz.fallingsand;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Width = Integer.parseInt(args[0]);
        int Height = Integer.parseInt(args[1]);
        int SandQuant = Integer.parseInt(args[2]);

        Scanner scanner = new Scanner(System.in);
        Sand sand = new Sand(Width, Height, new Random());

        sand.randomSand(SandQuant);
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
