/*
Prime Number finder program in java using the "Sieve of Eratosthenes" algorithm.
 */

public class primeRange {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java primeRange <start> <end>");
            System.exit(0);
        } else {
            int srange = Integer.parseInt(args[0]);
            int erange = Integer.parseInt(args[1]);

            int len = erange + 1;
            boolean[] primes = new boolean[len];

            for (int i = 0; i < len; i++) {
                primes[i] = true;
            }

            for (int p = 2; p * p <= erange; p++) {
                if (primes[p]) {
                    for (int i = 2 * p; i <= erange; i += p) {
                        primes[i] = false;
                    }
                }
            }

            for (int i = srange; i <= erange; i++) {
                if (primes[i]) {
                    System.out.print(i + "\t");
                }
            }
        }
    }
}