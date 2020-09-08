package hashing;

import java.util.*;

public class UnionNaiveSolution {

    static int getUnionCount(int a[], int b[], int m, int n) {
        int c[] = new int[m + n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < n; i++) {
            c[i] = b[i];
        }

        for (int j = 0; j < m + n; j++) {
            boolean flag = false;
            for (int k = 0; k < j; k++) {
                if (c[j] == c[k]) {
                    flag = true;
                    break;
                }
                if (flag == false) {
                    count++;
                }
            }

        }
        return count;
    }

    public static void main(String args[]) {
        int a[];
        int b[];
        int m, n, count;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n");
        n = scanner.nextInt();
        System.out.println("enter the m");
        m = scanner.nextInt();
        a = new int[n];
        b = new int[m];
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter the values");
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        count = getUnionCount(a, b, n, m);
        System.out.println(count);
        scanner.close();
    }
}