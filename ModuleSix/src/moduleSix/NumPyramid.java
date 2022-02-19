package moduleSix;

//  Justin Kreifels
//  Date: 2-8-2022

public class NumPyramid {

    public static void main(String[] args) {
        int rows = 7, count = 0;

        for (int i = 0; i < rows; i++) {
            int num = 1;

            for (int j = rows - i; j > 1; j--) {
                System.out.print("   ");
            }

            for (int j = 0; j <= count; j++) {
                if ((count - 1) <= 0) {
                    System.out.printf("  %d", num);
                    num *= 2;
                } else if (j <= ((count - 1) / 2)) {

                    System.out.printf("%s", ((num > 10) ? (" " + num) : ("  " + num)));
                    num *= 2;
                } else {

                    System.out.printf("%s", ((num > 10) ? (" " + num) : ("  " + num)));
                    num /= 2;
                }
            }

            count += 2;

            System.out.println();
        }
    }
}
