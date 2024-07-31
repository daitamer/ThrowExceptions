package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    public static int[] getUserInput() {
        Scanner scanner = new Scanner(System.in);

//        int divisor = 0;
//        int dividend = 0;
        int[] output = new int[2];

        while (true) {
            try {
                System.out.print("Enter Divisor: ");
                output[0] = scanner.nextInt();
                System.out.println("Enter Dividend: ");
                output[1] = scanner.nextInt();


                return output;

            } catch (InputMismatchException e) {
                System.err.print("Invalid input. Please try again");
            }
        }



    }

}