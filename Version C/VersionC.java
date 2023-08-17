import java.util.Random;

class RandNum {
    private int[][] numArray = new int[5][5];

    public RandNum() {
        Random ran = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numArray[i][j] = ran.nextInt(101);
            }
        }
    }

    public int calculateMinumum() {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numArray[i][j] < min) {
                    min = numArray[i][j];
                }
            }
        }

        return min;
    }

    public int calculateMaximum() {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numArray[i][j] > max) {
                    max = numArray[i][j];
                }
            }
        }

        return max;
    }

    public double calculateAvg() {
        int Total = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Total += numArray[i][j];
            }
        }

        return (double) Total / 25.0;

    }

    public void display() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numArray[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The minimum number is " + calculateMinumum());
        System.out.println("The maximum number is " + calculateMaximum());
        System.out.println("The Average is " + calculateAvg());
    }
}

public class VersionC {
    public static void main(String[] args) {
        RandNum rn = new RandNum();

        rn.display();
    }
}
