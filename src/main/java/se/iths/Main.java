package se.iths;
import java.util.Scanner;
// Michel Dahl 205-05-11
//

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hello
        System.out.println("Välkommen till HiLo!");
        System.out.println("Vilken Svårhetsgrad?");
        System.out.println("1. Lätt (1-10)");
        System.out.println("2. Mellan (1-100)");
        System.out.println("3. Svårt (1-1000)");


        int Level = scanner.nextInt();
        int maxNumber = 0;


        if (Level == 1) {
            maxNumber = 10;
        } else if (Level == 2) {
            maxNumber = 100;
        } else if (Level == 3) {
            maxNumber = 1000;
        }


        int gissningar = playGame(maxNumber);
        System.out.println("Du lyckades på " + gissningar + " försök");
    }


    public static int playGame(int maxNumber) {
        Scanner scanner = new Scanner(System.in);


        int number = (int) (Math.random() * maxNumber) + 1;
        int gissningar = 0;
        int guess = 0;


        while (guess != number) {
            System.out.println("Gissa på ett tal mellan 1 och " + maxNumber);
            guess = scanner.nextInt();
            gissningar++;


            giveResponse(number, guess);
        }

        return gissningar;
    }


    public static void giveResponse(int answer, int guess) {
        if (guess < answer) {
            System.out.println("Gissningen var för låg!");
        } else if (guess > answer) {
            System.out.println("Gissningen var för hög!");
        } else {
            System.out.println("Helt rätt!");
        }
    }
}
