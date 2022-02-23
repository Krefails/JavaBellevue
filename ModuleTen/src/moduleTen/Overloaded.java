/* 
 * Justin Kreifels
 * Date - 2022-02-22
 * Description - This program has four overloaded methods that take-in arrays of different data types. 
 * The overloaded methods return the average of the passed in array.
 * There is a method that returns a random number between 1 - 100.
 * There is a method that initalizes integer arrays to a size between 1-100, sets the arrays values to a random number, 
 * and returns the array created.
 * The main method initalizes four arrays of different data types (short, int, long, and double).
 * The main method prints all elements of the arrays to the console and calls/prints the overloaded average methods to the console. 
 * 
 * Example console output below:
 * 
 *   Now printing all arrays --
 *   v Short:  v Int:    v Long:   v Double:
 *   2         5         7         14.00     
 *   13        10        9         12.00     
 *   13        9         13        2.00      
 *   1         11        7         1.00      
 *   3         13        14        14.00     
 *   9         14        5         12.00     
 *   2         3         13        13.00     
 *   15                  3                   
 *   5                   7                   
 *   6                                       
 *
 *   Now printing averages of arrays --
 *   v Short:  v Int:    v Long:   v Double: 
 *   6         9         8         9.71   
 */

package moduleTen;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Overloaded {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {

    short[] shortArray = new short[randNumber()];
    for (short i = 0; i <= (shortArray.length - 1); i++) {
      shortArray[i] = (short) randNumber();
    }

    int[] intArray = arrInitializr();
    long[] longArray = Arrays.stream(arrInitializr()).mapToLong(i -> i).toArray();
    double[] doubleArray = Arrays.stream(arrInitializr()).mapToDouble(i -> i).toArray();

    int largest = Math.max(shortArray.length,
        Math.max(intArray.length, Math.max(longArray.length, Math.max(doubleArray.length, shortArray.length))));

    System.out.printf("Now printing all arrays --\n%-10s%-10s%-10s%-10s", "v Short:", "v Int:", "v Long:",
        "v Double:\n");

    for (int i = 0; i <= (largest - 1); i++) {

      if ((shortArray.length - 1) >= i) {
        System.out.printf("%-10d", shortArray[i]);
      } else {
        System.out.printf("%-10s", " ");
      }

      if ((intArray.length - 1) >= i) {
        System.out.printf("%-10d", intArray[i]);
      } else {
        System.out.printf("%-10s", " ");
      }

      if ((longArray.length - 1) >= i) {
        System.out.printf("%-10d", longArray[i]);
      } else {
        System.out.printf("%-10s", " ");
      }

      if ((doubleArray.length - 1) >= i) {
        System.out.printf("%-10.2f", doubleArray[i]);
      } else {
        System.out.printf("%-10s", " ");
      }
      System.out.println();
    }

    System.out.printf("\nNow printing averages of arrays --\n%-10s%-10s%-10s%-10s\n", "v Short:", "v Int:", "v Long:",
        "v Double:");
    System.out.printf("%-10d%-10d%-10d%-10.2f\n", average(shortArray), average(intArray), average(longArray),
        average(doubleArray));

  }

  /**
   * 
   * @param shortArr
   * @return
   */
  public static short average(short[] shortArr) {

    short avg = (short) shortArr.length;
    short sum = 0;

    for (int i = 0; i <= (avg - 1); i++)
      sum += shortArr[i];

    return (short) (sum / avg);

  }

  /**
   * 
   * @param intArr
   * @return
   */
  public static int average(int[] intArr) {

    int avg = intArr.length;
    int sum = 0;

    for (int i = 0; i <= (avg - 1); i++)
      sum += intArr[i];

    return sum / avg;

  }

  /**
   * 
   * @param longArr
   * @return
   */
  public static long average(long[] longArr) {

    long avg = longArr.length;
    long sum = 0;

    for (int i = 0; i <= (avg - 1); i++)
      sum += longArr[i];

    return sum / avg;

  }

  /**
   * 
   * @param doubleArr
   * @return
   */
  public static double average(double[] doubleArr) {

    double avg = doubleArr.length;
    double sum = 0;

    for (int i = 0; i <= (doubleArr.length - 1); i++)
      sum += doubleArr[i];

    return sum / avg;

  }

  /**
   * 
   * @return
   */
  public static int randNumber() {
    return ThreadLocalRandom.current().nextInt(1, 100 + 1);
  }

  /**
   * 
   * @return
   */
  public static int[] arrInitializr() {

    int arr[] = new int[randNumber()];

    for (int i = 0; i <= (arr.length - 1); i++) {
      arr[i] = randNumber();
    }

    return arr;

  }
}
