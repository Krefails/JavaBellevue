/**
 * Justin Kreifels
 * 2022-04-05
 * This program uses the ArrayList, Collections, and Scanner packages.
 * It initalizes an Integer ArrayList and adds user input until zero is
 * submitted. It then displays all elements in the ArrayList sorted
 * from smallest to largest. It then print the largest element out
 * to the console. 
 */
package moduleFour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JustinArrayListTest {

    public static Integer LargestElement(ArrayList<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size() - 1);
    }

    public static void main(String[] args) {
        Integer num;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        do {
            System.out.print("Please input a whole number (0 to stop):  ");
            while (!input.hasNextInt()) {
                System.out.print("Error - please input a whole number (0 to stop):  ");
                input.next();
            }
            num = input.nextInt();
            arrayList.add(num);
        } while (num != 0);

        System.out.println("\nBelow is your list of numbers:");
        Collections.sort(arrayList);
        for (Integer index : arrayList) {
            System.out.printf("%d\n", index);
        }

        System.out.printf("The largest number in the list is %d", LargestElement(arrayList));

        input.close();
    }
}
