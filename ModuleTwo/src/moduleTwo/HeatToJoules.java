package moduleTwo;

/**
 * @date 2021-01-18
 * @author Justin Kreifels
 * This program prompts the user for three floating point values. It then preforms a calculation and prints the results.
 */
import java.util.Scanner;

public class HeatToJoules {
    
    public static void main(String[] args) {
        heatConversion();
    }
    
    static void heatConversion() {
        Scanner input = new Scanner(System.in);
        final int WATER_HEAT_CAPACITY = 4184;
        float waterMass;
        float finalTemperature;
        float initialTemperature;
        float joules;
        
        System.out.print("Please input water weight in kilograms (kg) >> ");
        waterMass = input.nextFloat();
        input.nextLine();
        System.out.print("Please input the inital temputure of the water in celsius (C) >> ");
        initialTemperature = input.nextFloat();
        input.nextLine();
        System.out.print("Please input the final temputure of the water in celsius (C) >> ");
        finalTemperature = input.nextFloat();
        input.nextLine();
        
        joules = waterMass * (finalTemperature - initialTemperature) * WATER_HEAT_CAPACITY;
        System.out.printf("The amount of energy needed to raise the waters temputure to %.0fC is %.2fj", finalTemperature, joules);
    }
}
