package hashing;

import java.util.*;

public class LongestConsecutiveSubsequence {

    static int longConsecutive(int arr[], int N) {
        HashSet<Integer> set = new HashSet<Integer>(N);
        for (int i = 0; i < N; i++) {
            set.add(arr[i]);
        }
        int res = 0;
        int curr = 0;
        for (int i = 0; i < N; i++) {
            if (!set.contains(arr[i] - 1)) {
                curr = 1;
                while (set.contains(arr[i] + curr)) {
                    curr++;
                }
                res = Math.max(curr, res);
            }
        }
        return res;

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
            System.out.println(longConsecutive(arr, n));
        }
    }
}