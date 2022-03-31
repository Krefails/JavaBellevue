package moduleThree;

public class JustinIntTest {
    public static void main(String[] args) {
        /* Create a Integer wrapper class that is initialized to 1 
         * so that it fails on the isPrime() method
         * */
        Integer integer = 1;
        JustinInteger justinOne = new JustinInteger(), justinTwo = new JustinInteger(),
                justinThree = new JustinInteger();

        // First set justinOne and Two to the same value
        justinOne.setJustin(10);
        justinTwo.setJustin(10);

        // Set justinThree to 29 that way it passes isPrime()
        justinThree.setJustin(29);

        // Run all isEven() methods and print the results
        System.out.printf("It is \"%b\" that %d is an even number\n", justinOne.isEven(), justinOne.getJustin());
        System.out.printf("It is \"%b\" that %d is an even number\n", justinTwo.isEven(), justinTwo.getJustin());
        System.out.printf("It is \"%b\" that %d is an even number\n", justinThree.isEven(), justinThree.getJustin());
        System.out.printf("It is \"%b\" that %d is an even number\n", JustinInteger.isEven(72), 72);
        System.out.printf("It is \"%b\" that %d is an even number\n", JustinInteger.isEven(integer), integer);

        // Run all isOdd() methods and print the results
        System.out.printf("It is \"%b\" that %d is an odd number\n", justinOne.isOdd(), justinOne.getJustin());
        System.out.printf("It is \"%b\" that %d is an odd number\n", justinTwo.isOdd(), justinTwo.getJustin());
        System.out.printf("It is \"%b\" that %d is an odd number\n", justinThree.isOdd(), justinThree.getJustin());
        System.out.printf("It is \"%b\" that %d is an odd number\n", JustinInteger.isOdd(182), 182);
        System.out.printf("It is \"%b\" that %d is an odd number\n", JustinInteger.isOdd(integer), integer);

        // Run all isPrime() methods and print the results
        System.out.printf("It is \"%b\" that %d is a prime number\n", justinOne.isPrime(), justinOne.getJustin());
        System.out.printf("It is \"%b\" that %d is a prime number\n", justinTwo.isPrime(), justinTwo.getJustin());
        System.out.printf("It is \"%b\" that %d is a prime number\n", justinThree.isPrime(), justinThree.getJustin());
        System.out.printf("It is \"%b\" that %d is a prime number\n", JustinInteger.isPrime(59), 59);
        System.out.printf("It is \"%b\" that %d is a prime number\n", JustinInteger.isPrime(integer), integer);

        // Run all equals() methods and print the results
        System.out.printf("It is \"%b\" that 31 is equal to %d\n", justinOne.equals(31), justinOne.getJustin());
        System.out.printf("It is \"%b\" that 10 is equal to %d\n", justinTwo.equals(10), justinTwo.getJustin());

        // However for this equals() pass in justinTwo's value as the argument
        System.out.printf("It is \"%b\" that %d is equal to %d", justinThree.equals(justinTwo.getJustin()),
                justinTwo.getJustin(), justinThree.getJustin());

    }
}
