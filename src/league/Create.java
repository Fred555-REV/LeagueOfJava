package league;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Create {
    public static Scanner scan = new Scanner(System.in);
    public static List<Champion> champions = new ArrayList<>();

    public static void seth(int index) {
        System.out.println("Enter your username: ");
        String name = scan.nextLine();
        champions.add(new Seth(name, 600, 60, 0, 33, 32));
    }

    public static void Mort(int index) {
        System.out.println("Enter your username: ");
        String name = scan.nextLine();
        champions.add(new Mort(name, 575, 61, 0, 3, 4));
    }

    public static void Garry(int index) {
        System.out.println("Enter your username: ");
        String name = scan.nextLine();
        champions.add(new Garry(name, 620, 66, 0, 36, 32));
    }
}
