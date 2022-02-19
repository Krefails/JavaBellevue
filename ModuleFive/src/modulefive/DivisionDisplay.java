package modulefive;

/**
 *
 * @author Justin Kreifels
 * @Date 2-1-2022
 * This program do-while loops printing 1/3 to 1/99 from ascending to descending order.
 */
public class DivisionDisplay{

    public static void main(String[] args) {        
        float i = 3;
        System.out.println("Now printing values from smallest to largest:");
        do {
            System.out.print(1 / i + "\n");
            i++;
        } while(i <= 99);
        
        i = 99;
        System.out.println("\nNow printing values from largest to smallest:");
        do {
            System.out.print(1 / i + "\n");
            i--;
        } while(i >= 3);
    }
}
