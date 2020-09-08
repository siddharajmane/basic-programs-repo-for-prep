package hashing;

import java.util.*;

class SubArrayWithZeroSum {

    static boolean findsum(int arr[], int n) {
        HashSet<Integer> set = new HashSet<Integer>(n);
        int prefix_sum = 0;
        for (int i = 0; i < n; i++) {
            prefix_sum = prefix_sum + arr[i];
            if (set.contains(prefix_sum) == true) {
                return true;
            }
            if (prefix_sum == 0) {
                return true;
            }
            set.add(prefix_sum);
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            t--;
            System.out.println(findsum(arr, n) == true ? "Yes" : "No");
        }
    }
}