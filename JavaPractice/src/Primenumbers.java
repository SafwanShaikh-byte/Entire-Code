public class Primenumbers {

    public static void main(String[] args) {
        // Test with a number
        int number = 40;

        // Call the isPrime method to check if the number is prime
        if (isPrime(number)) {
            System.out.println("Number is Prime: " + number);
        } else {
            System.out.println("Number is Not Prime: " + number);
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        // Handle edge cases for numbers less than or equal to 1
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // number is divisible by i, so it's not prime
            }
        }

        return true; // If no divisors were found, it's a prime number
    }
}
