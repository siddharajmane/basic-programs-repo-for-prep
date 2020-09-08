package hashing;

import java.util.*;

public class DistinctElement {

    public static int getDistinctCount(int arr[], int n) {
        HashSet<Integer> set = new HashSet<Integer>(n);
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        return set.size();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n, a[], count;
        System.out.println("Enter n");
        n = scanner.nextInt();
        a = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        count = 0;
        count = getDistinctCount(a, n);
        System.out.println(count);
        scanner.close();
    }

}
