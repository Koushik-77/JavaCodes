import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the upper limit for prime numbers: ");
        int limit = in.nextInt();

        System.out.println("Prime numbers up to " + limit + " are:");

        // Loop to iterate through numbers up to the limit
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;

            // Check if the current number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the current number is prime, print it
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
