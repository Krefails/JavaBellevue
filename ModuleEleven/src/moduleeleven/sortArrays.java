package moduleeleven;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class sortArrays {

    /**
     * 
     * @return
     */
    public static int randNumber() {
        return ThreadLocalRandom.current().nextInt(1, 10 + 1);
    }

    /**
     * 
     * @return
     */
    public static int[][] arrInitializr() {
        int arr[][] = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j * 2;
            }
            arr[i][0] = i+ 1;
            arr[0][i] = i + 1;
        }

        return arr;

    }

    /**
     * 
     * @param arrayParam
     * @return
     */
    public static int locateLargest(double[][] arrayParam) {
        return 1;
    }

    /**
     * 
     * @param arrayParam
     * @return
     */
    public static int locateLargest(int[][] arrayParam) {
        return 1;
    }

    /**
     * 
     * @param arrayParam
     * @return
     */
    public static int locateSmallest(double[][] arrayParam) {
        return 1;
    }

    /**
     * 
     * @param arrayParam
     * @return
     */
    public static int locateSmallest(int[][] arrayParam) {
        return 1;
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[][] array = arrInitializr();

        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
            
        }
        
    }
}