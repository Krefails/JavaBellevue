/**
 * Justin Kreifels
 * 2022-13-04
 * 
 * Creates, reads, and writes a file named data.file with random integers
 */
package ModuleFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumToFile {
    public static void main(String[] args) throws IOException {
        createFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File data = new File("data.file");

        try {
            if (data.createNewFile()) {
                System.out.println("File created: " + data.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException err) {
            System.out.println("An error has occured");
            err.printStackTrace();
        }
    }

    public static void writeFile() throws IOException {
        FileWriter writeData = new FileWriter("data.file", true);

        System.out.println("Now wrting to data.file...");
        for (Integer i : randNumberArray()) {
            writeData.write(i.toString() + " ");
        }

        writeData.close();
    }

    public static void readFile() throws FileNotFoundException {
        File data = new File("data.file");
        Scanner readData = new Scanner(data);

        System.out.println("Now reading file:");
        while (readData.hasNextLine()) {
            System.out.println(readData.nextLine());
        }
        readData.close();
    }

    public static ArrayList<Integer> randNumberArray() {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrList.add(ThreadLocalRandom.current().nextInt(1, 100 + 1));
        }

        return arrList;
    }
}
