package league;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to League of Java!");
        System.out.println("--------------------------");
        System.out.println("How many characters would you like to create?");
        int characterAmount = sc.nextInt();
        for (int i = 0; i < characterAmount; i++) {
            Display.championsAvailable();
            System.out.println("Which Champion would you like to create? 0/1/2");
            switch (sc.nextInt()) {
                case 0:
                    sc.nextLine();
                    Create.seth(i);
                    break;
                case 1:
                    sc.nextLine();
                    Create.Mort(i);
                    break;
                case 2:
                    sc.nextLine();
                    Create.Garry(i);
                    break;
            }
        }
        System.out.println("Created characters are...");
        Display.championsCreated();
    }
}
/*

*/