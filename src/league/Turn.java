package league;

public class Turn {
    public static int count = 0;

    public static void pass() {
        count++;
    }

    public static void display() {
        System.out.println(count);
    }
}
