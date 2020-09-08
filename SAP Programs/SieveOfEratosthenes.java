import java.util.*;

public class SieveOfEratosthenes {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }

        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                for (int j = 2; j * i <= n; j++) {
                    prime[i * j] = false;
                }
            }
        }

        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == true) {
                System.out.print(i + " ");
            }
        }

    }
}