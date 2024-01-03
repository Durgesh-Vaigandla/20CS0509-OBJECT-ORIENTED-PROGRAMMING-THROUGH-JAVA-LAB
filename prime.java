import java.util.Scanner;
    public class prime {
        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                try {
                    System.out.print("Enter the desired number: ");
                    int N = scanner.nextInt();

                    System.out.println("Prime numbers up to " + N + ":");
                    for (int i = 2; i <= N; i++) {
                        if (isPrime(i)) {
                            System.out.print(i + " ");
                        }
                    }
                } finally {
                    scanner.close();
                }
            }
        }
