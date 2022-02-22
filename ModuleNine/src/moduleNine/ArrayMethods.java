/**
 * Justin Kreifels
 * Date - 2022-22-02
 * This program initializes an array with 20 integars, takes in user input, and runs methods that effect the array.
 */

package moduleNine;

import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;
import java.lang.Integer;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayMethods {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int[] numArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        boolean user = true;

        System.out.print("Do you want to input each array value? (Y/N)  ");
        if (input.nextLine().toLowerCase().equals("y"))
            user = false;

        for (int i = 0; i <= (numArr.length - 1); i++) {
            if (!user) {
                System.out.printf("%d Array Index =  ", numArr[i]);

                try {
                    choice = Integer.parseInt(input.next());
                } catch (NumberFormatException a) {
                    System.out.println("Problem! Please enter an number only");
                    System.out.printf("%d Array Index =  ", numArr[i]);
                    choice = Integer.parseInt(input.next());
                }

                input.nextLine();
            } else
                choice = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            numArr[i] = choice;
        }

        for (int i = 0; i <= (numArr.length - 1); i++) {
            System.out.println("--" + numArr[i]);
        }
        System.out.printf("\nThe highest Value is: %d\n", highestVal(numArr));
        System.out.printf("The lowest Value is: %d\n", lowestVal(numArr));
        System.out.printf("The average of the array is: %.2f\n", avgVal(numArr));
        System.out.printf("The sum of the array is: %d\n", sumVal(numArr));

        input.close();
    }

    /**
     * 
     * @param numArr
     * @return avg
     */
    public static int highestVal(int[] numArr) {
        Arrays.sort(numArr/* , Collections.reverseOrder() */);
        return numArr[19];
    }

    /**
     * 
     * @param numArr
     * @return
     */
    public static int lowestVal(int[] numArr) {
        Arrays.sort(numArr);
        return numArr[0];
    }

    /**
     * 
     * @param numArr
     * @return
     */
    public static float avgVal(int[] numArr) {
        float avg = numArr.length;
        int sum = sumVal(numArr);
        return sum / avg;
    }

    /**
     * 
     * @param numArr
     * @return
     */
    public static int sumVal(int[] numArr) {
        int sum = 0;

        for (int i = 0; i <= (numArr.length - 1); i++)
            sum += numArr[i];

        return sum;
    }
}
