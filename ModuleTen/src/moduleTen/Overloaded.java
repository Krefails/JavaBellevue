/* 
 * Justin Kreifels
 * Date - 2022-02-22
 * Description - This program has four overloaded methods that take-in arrays of different data types. 
 * The overloaded methods return the average of the passed in array.
 * There is a method that returns a random number between 1 - 100.
 * There is a method that initalizes integer arrays and returns the array created.
 * The main method initalizes four arrays of different data types (short, int, long, and double).
 * The main method prints all elements of the arrays to the console and calls/prints the overloaded average methods to the console. 
 * 
 * Example console output below:
 * 
 *   Now printing all arrays --
 *   v Short:  v Int:    v Long:   v Double:
 *   13        96        50        89.00     
 *   12        98        88        14.00     
 *   27        47        56        43.00     
 *   12        4         16        73.00     
 *   36        66        66        5.00      
 *   13        5         33        46.00     
 *   53        85        59        97.00     
 *   44        30        87        23.00     
 *   8         88        8         64.00     
 *   60        48        77        98.00     
 *
 *   Now printing averages of arrays --
 *   v Short:  v Int:    v Long:   v Double: 
 *   27        56        54        55.20    
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

    short[] shortArray = new short[10];
    for (short i = 0; i <= (shortArray.length - 1); i++) {
      shortArray[i] = (short) randNumber();
    }

    int[] intArray = arrInitializr();
    long[] longArray = Arrays.stream(arrInitializr()).mapToLong(i -> i).toArray();
    double[] doubleArray = Arrays.stream(arrInitializr()).mapToDouble(i -> i).toArray();

    System.out.printf("Now printing all arrays --\n%-10s%-10s%-10s%-10s", "v Short:", "v Int:", "v Long:",
        "v Double:\n");

    for (int i = 0; i <= (shortArray.length - 1); i++) {

      if ((shortArray.length - 1) >= i) {
        System.out.printf("%-10d", shortArray[i]);
      }

      if ((intArray.length - 1) >= i) {
        System.out.printf("%-10d", intArray[i]);
      }

      if ((longArray.length - 1) >= i) {
        System.out.printf("%-10d", longArray[i]);
      }

      if ((doubleArray.length - 1) >= i) {
        System.out.printf("%-10.2f\n", doubleArray[i]);
      }
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

    int arr[] = new int[10];

    for (int i = 0; i <= (arr.length - 1); i++) {
      arr[i] = randNumber();
    }

    return arr;

  }
}
