package hashing;

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

public class RelativeSorting {
    static void relativesort(int arr1[], int arr2[]) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (set.containsKey(arr1[i]) == false) {
                set.put(arr1[i], 1);
            } else {
                int freq = set.get(arr1[i]);
                freq++;
                set.put(arr1[i], freq);
            }
        }

        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            if (set.containsKey(arr2[i])) {
                int freq = set.get(arr2[i]);
                while (freq > 0) {
                    System.out.print(arr2[i] + " ");
                    freq--;
                }
                set.remove(arr2[i]);
            }
        }

        ArrayList<Integer> n = new ArrayList<Integer>();

        for (Map.Entry<Integer, Integer> e : set.entrySet()) {
            n.add(e.getKey());
        }

        int n1[] = new int[n.size()];
        for (int i = 0; i < n.size(); i++) {
            n1[i] = n.get(i);
        }

        Arrays.sort(n1);

        for (int i = 0; i < n1.length; i++) {
            int g = set.get(n1[i]);
            if (g > 1) {
                while (g > 0) {
                    System.out.print(n1[i] + " ");
                    g--;
                }
            } else {
                System.out.print(n1[i] + " ");
            }

        }
    }

    public static void main(String args[]) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t > 0) {
            int n1 = fr.nextInt();
            int n2 = fr.nextInt();
            int a1[] = new int[n1];
            int a2[] = new int[n2];
            for (int i = 0; i < n1; i++) {
                a1[i] = fr.nextInt();
            }
            for (int i = 0; i < n2; i++) {
                a2[i] = fr.nextInt();
            }
            relativesort(a1, a2);
        }

    }

}