/**
 * Justin Kreifels
 * 2022-13-04
 * 
 * Prints the Night Parade of one hundred demons to the console.
 * Accepts user input
 */
package ModuleFive;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListYokai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nightParade = new ArrayList<>();
        String choice;
        nightParade.add("Sekiyo");
        nightParade.add("Buruburu");
        nightParade.add("Akayashi");
        nightParade.add("Genbu");
        nightParade.add("Kitsune");
        nightParade.add("Yuki-Onna");
        nightParade.add("Jorogumo");
        nightParade.add("Isonade");
        nightParade.add("Tsuchigumo");
        nightParade.add("Nurarihyon");

        for (String yokai : nightParade)
            System.out.println(yokai);

        do {
            System.out.println("What yokai would you like to see again?"
                    + "\n(Enter a yokais name, \"exit\" to quit, or \"Night Parade\" to print all yokai.)");
            System.out.print("\t>> ");
            choice = input.nextLine();

            if (choice.toLowerCase().equals("exit")) {
                break;
            } else if (choice.toLowerCase().equals("night parade")) {
                for (String yokai : nightParade)
                    System.out.println(yokai);
                continue;
            }

            try {
                System.out.println(nightParade.get(nightParade.indexOf(capitalize(choice))));
            } catch (IndexOutOfBoundsException err) {
                System.out.printf("An exception has been thrown: %s\n", err);
            }
        } while (true);

        input.close();
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        str = str.toLowerCase();
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
