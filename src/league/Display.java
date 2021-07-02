package league;

import java.util.List;

import static league.Create.champions;

public class Display {
    public static void championsAvailable() {
        System.out.println("Champions available are:");
        System.out.println("Seth -- 0");
        System.out.println("Mort -- 1");
        System.out.println("Garry -- 2");

    }

    public static void names() {
        for (int i = 0; i < champions.size(); i++) {
            System.out.println("name: " + champions.get(i).name + "index: " + i);
        }
    }

    public static void championsCreated() {
        for (int i = 0; i < champions.size(); i++) {
            System.out.println("Champion: " + champions.get(i).getClass().getSimpleName() + ", name: " + champions.get(i).name + ", index: " + i);
        }
    }
}
