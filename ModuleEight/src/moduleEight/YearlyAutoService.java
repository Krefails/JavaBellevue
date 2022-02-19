package moduleEight;

import java.util.Scanner;

/**
 * This program has four overloaded methods that take in booleans and return doubles
 * @author Justin Kreifels
 * @date 02-15-2022
 */
public class YearlyAutoService {
    
    public static double yearlyService() {
        return 100.00;
    }

    public static double yearlyService(boolean oil) {
        return 20;
    }

    public static double yearlyService(boolean oil, boolean tire) {
        return 50;
    }

    public static double yearlyService(boolean oil, boolean tire, boolean coupon) {
        return 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choice;
        double total = 0;

        System.out.print("Do you want to service your car today? (The price is $100 for base maintance)\n(Y/N): ");
        choice = input.nextLine();
        if(choice.toLowerCase().equals("y")) {
            
            total += yearlyService();
            System.out.print("Do you want to change your oil and filter today? (The price is $20 extra for oil)\n(Y/N): ");
            choice = input.nextLine();
            
            if(choice.toLowerCase().equals("y")) {
                
                total += yearlyService(true);
                System.out.print("Do you want to rotate your tires today? (The price is $50 extra)\n(Y/N): ");
                choice = input.nextLine();
                
                if(choice.toLowerCase().equals("y")) {
                    
                    total += yearlyService(true, true);
                    System.out.print("You have a special coupon do you want to use it? (50% of total cost)\n(Y/N): ");
                    choice = input.nextLine();
                    
                    if(choice.toLowerCase().equals("y")) {
                        total /= yearlyService(true, true, true);
                    }
                }
            }
        }

        System.out.printf("Your total cost today is $%.2f\n\n", total);

        System.out.println("-- Running all methods at once below --");
        System.out.printf("Your total cost today is $%.2f", (yearlyService() + yearlyService(true) + yearlyService(true, true)) / yearlyService(true, true, true));

        input.close();
    }
}
