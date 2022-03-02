/* 
 * Justin Kreifels
 * March 1st, 2022
 * Module 11.
 * 
 * This program is all about 2D arrays! In this program, there are eight methods, six of which are overloaded. 
 * The overloaded method called arrInitializer creates a 2D display, either a double or int.
 * It initializes the array to have a random number, ranging from five to ten.
 * It then adds values to the array's indexes through nested for-loops. For example, when every first array index or second array index is 0, 
 * the for-loop passes in a number that increments each loop iteration, going from 0 to the array's length. 
 * Next are the overloaded methods for finding the most enormous and diminutive number in the 2D arrays. 
 * These methods use nested for-loops to compare if the current value in the array is larger/smaller than the previous value. 
 * They return an integer array with a three size; we store the x and y location for the most significant/most minor number and the number itself. 
 * Finally, the main method we call on all methods is to print both an integer array and double array to the console. 
 * I have it formatted to make it easier to find the largest and smallest values. 
 * I have enjoyed your feedback on my assignments! 
 * I do not have much time on my hands, as I work as a full-time software engineer, but I enjoy going the extra mile. 
 * I hope Mr. Longley, you enjoy reviewing my code!
 * 
 * Example Console Output:
 * 
 * Integer Array:
 * Y = rows, X = collums
 *   X
 * Y 0       1       2       3       4       5       6       7       8
 *   1       18      24      35      20      43      70      26      87
 *   2       39      88      53      55      58      34      82      1
 *   3       44      87      4       82      70      7       35      70
 *   4       62      78      57      17      56      24      60      13
 *   5       57      58      24      45      83      71      62      44
 *   6       2       96      8       66      49      34      36      29
 *
 * The largest number for integer array is 96, at row 2, col 6
 * The smallest number for integer array is 1, at row 8, col 2
 *
 * Double Array:
 * Y = rows, X = collums
 *   X
 * Y 0       1       2       3       4       5       6
 *   1       90      57      11      99      84      13
 *   2       31      15      93      80      13      26
 *   3       28      46      21      77      58      62
 *   4       49      1       82      55      50      57
 *   5       63      95      48      20      80      64
 *   6       33      65      80      59      1       65
 *   7       10      90      13      86      28      42
 *   8       53      64      73      63      21      35
 *   9       7       22      93      44      35      42
 *
 * The largest number for double array is 99, at row 4, col 1
 * The smallest number for double array is 1, at row 2, col 4
*/
package moduleeleven;

import java.util.concurrent.ThreadLocalRandom;

public class sortArrays {

    /**
     * 
     * @return
     */
    public static int randNumber(boolean large) {
        if (large == true)
            return ThreadLocalRandom.current().nextInt(1, 100 + 1);
        else
            return ThreadLocalRandom.current().nextInt(5, 10 + 1);
    }

    /**
     * 
     * @return
     */
    public static int[][] arrInitializer() {
        int arr[][] = new int[randNumber(false)][randNumber(false)];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0)
                    arr[i][j] = i + j;
                else if (j == 0)
                    arr[i][j] = i + j;
                else
                    arr[i][j] = randNumber(true);
            }
        }
        return arr;
    }

    public static double[][] arrInitializer(boolean isDouble) {
        double arr[][] = new double[randNumber(false)][randNumber(false)];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0)
                    arr[i][j] = i + j;
                else if (j == 0)
                    arr[i][j] = i + j;
                else
                    arr[i][j] = randNumber(true);
            }
        }
        return arr;
    }

    /**
     * 
     * @param arrayParam
     * @return
     */
    public static int[] locateLargest(double[][] arrayParam) {
        // Creates a variable with the lowest value an integer can hold.
        // Integer.MIN_Value == -2,147,483,647
        int min = Integer.MIN_VALUE;
        int[] maxArr = { 0, 0, min };

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (maxArr[2] < arrayParam[i][j]) {
                    maxArr[0] = (int) arrayParam[i][0];
                    maxArr[1] = (int) arrayParam[0][j];
                    maxArr[2] = (int) arrayParam[i][j];
                }
            }
        }

        return maxArr;
    }

    /**
     * This method returns a int array with three indexs, the first index holds
     * rows,
     * the second holds the collum, and the third holds the largest number in the
     * array.
     * 
     * @param arrayParam
     * @return int[]
     */
    public static int[] locateLargest(int[][] arrayParam) {
        // Creates a variable with the lowest value an integer can hold.
        // Integer.MIN_Value == -2,147,483,647
        int min = Integer.MIN_VALUE;
        int[] maxArr = { 0, 0, min };

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[1].length; j++) {
                if (maxArr[2] < arrayParam[i][j]) {
                    maxArr[0] = arrayParam[i][0];
                    maxArr[1] = arrayParam[0][j];
                    maxArr[2] = arrayParam[i][j];
                }
            }
        }

        return maxArr;
    }

    /**
     * 
     * @param arrayParam
     * @return
     */
    public static int[] locateSmallest(double[][] arrayParam) {
        // Creates a variable with the highest value an integer can hold.
        // Integer.MAX_Value == 147483647
        int max = Integer.MAX_VALUE;
        int[] maxArr = { 0, 0, max };

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[1].length; j++) {
                if (i == 0)
                    continue;
                else if (j == 0)
                    continue;

                if (maxArr[2] > arrayParam[i][j]) {
                    maxArr[0] = (int) arrayParam[i][0];
                    maxArr[1] = (int) arrayParam[0][j];
                    maxArr[2] = (int) arrayParam[i][j];
                }
            }
        }

        return maxArr;
    }

    /**
     * 
     * @param arrayParam
     * @return
     */
    public static int[] locateSmallest(int[][] arrayParam) {
        // Creates a variable with the highest value an integer can hold.
        // Integer.MAX_Value == 147483647
        int max = Integer.MAX_VALUE;
        int[] maxArr = { 0, 0, max };

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (i == 0)
                    continue;
                else if (j == 0)
                    continue;

                if (maxArr[2] > arrayParam[i][j]) {
                    maxArr[0] = arrayParam[i][0];
                    maxArr[1] = arrayParam[0][j];
                    maxArr[2] = arrayParam[i][j];
                }
            }
        }

        return maxArr;
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] intArrayMax, doubleArrayMax, intArrayMin, doubleArrayMin;
        int[][] intArray = arrInitializer();
        double[][] doubleArray = arrInitializer(true);

        System.out.print("Integer Array:\nY = rows, X = collums\n  X\n");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if (i == 0 && j == 0)
                    System.out.printf("Y %d\t", intArray[i][j]);
                else
                    System.out.printf("  %d\t", intArray[i][j]);
            }
            System.out.println("");
        }

        intArrayMax = locateLargest(intArray);
        System.out.printf("\nThe largest number for integer array is %d, at row %d, col %d", intArrayMax[2],
                intArrayMax[1],
                intArrayMax[0]);

        intArrayMin = locateSmallest(intArray);
        System.out.printf("\nThe smallest number for integer array is %d, at row %d, col %d\n", intArrayMin[2],
                intArrayMin[1],
                intArrayMin[0]);

        System.out.print("\nDouble Array:\nY = rows, X = collums\n  X\n");
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                if (i == 0 && j == 0)
                    System.out.printf("Y %.0f\t", doubleArray[i][j]);
                else
                    System.out.printf("  %.0f\t", doubleArray[i][j]);
            }
            System.out.println("");
        }

        doubleArrayMax = locateLargest(doubleArray);
        System.out.printf("\nThe largest number for double array is %d, at row %d, col %d", doubleArrayMax[2],
                doubleArrayMax[1],
                doubleArrayMax[0]);

        doubleArrayMin = locateSmallest(doubleArray);
        System.out.printf("\nThe smallest number for double array is %d, at row %d, col %d", doubleArrayMin[2],
                doubleArrayMin[1],
                doubleArrayMin[0]);
    }
}