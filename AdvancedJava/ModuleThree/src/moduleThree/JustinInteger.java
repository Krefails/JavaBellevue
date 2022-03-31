/**
 * Justin Kreifels
 * 2022-03-30
 * This class has multiple overloaded methods that return boolean values.
 * It is only used in the JustinIntTest class.
 */
package moduleThree;

class JustinInteger {
    private int justin = 0;

    JustinInteger() {
        setJustin(justin);
    }

    public int getJustin() {
        return justin;
    }

    public void setJustin(int justin) {
        this.justin = justin;
    }

    public boolean isEven() {
        if (justin % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean isOdd() {
        if (!(justin % 2 == 0))
            return true;
        else
            return false;
    }

    // Because 1 is no longer counted as a prime number it will return false.
    public boolean isPrime() {
        if (justin == 1)
            return false;
        for (int i = 2; i <= justin / 2; i++) {
            if (justin % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean isOdd(int num) {
        if (!(num % 2 == 0))
            return true;
        else
            return false;
    }

    public static boolean isPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(Integer num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean isOdd(Integer num) {
        if (!(num % 2 == 0))
            return true;
        else
            return false;
    }

    public static boolean isPrime(Integer num) {
        if (num == 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int num) {
        if (num == justin)
            return true;
        else
            return false;
    }

    public boolean equals(Integer num) {
        if (num == justin)
            return true;
        else
            return false;
    }
}