import java.util.*;

public class Butterfly {

    public static void ButterflyPattern(int rows) {

        // 1st Half
        for (int i = 1; i <= rows; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces

            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print(" ");
            }

            // starts

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Half
        for (int i = rows; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces

            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print(" ");
            }

            // starts

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        ButterflyPattern(rows);
    }
}
