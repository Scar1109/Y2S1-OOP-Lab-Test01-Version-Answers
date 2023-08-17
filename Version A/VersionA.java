import java.util.Random;
import java.util.Scanner;

class Lottery {

    private int[] lotteryNumbers = new int[5];

    public Lottery() {
        Random rd = new Random();

        for (int i = 0; i < 5; i++) {
            lotteryNumbers[i] = rd.nextInt(10); // Generates random numbers between 0 and 9
        }
    }

    public int compareNumbers(int userNumbers[]) {
        int matchingDigits = 0;

        for (int i = 0; i < 5; i++) {
            if (lotteryNumbers[i] == userNumbers[i]) {
                matchingDigits++;
            }
        }

        return matchingDigits;
    }

    public int[] getLotteryNumbers() {
        return lotteryNumbers;
    }
}

public class VersionA {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int userNumbers[] = new int[5];

        System.out.println("Enter your 5 lottery numbers:");
        for (int i = 0; i < 5; i++) {
            userNumbers[i] = sc.nextInt();
        }

        Lottery lottery = new Lottery();
        int matchingDigits = lottery.compareNumbers(userNumbers);

        System.out.print("User's Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + userNumbers[i]);
        }
        System.out.println();

        System.out.print("Lottery Numbers:");
        int lotteryNumbers[] = lottery.getLotteryNumbers();
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + lotteryNumbers[i]);
        }
        System.out.println();

        System.out.println("Number of matching digits: " + matchingDigits);

        sc.close();
    }
}
