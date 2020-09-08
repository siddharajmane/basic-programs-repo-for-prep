import java.util.*;

public class IftwoArrayEqualOrNot {

    static boolean getArrayEquality(int arr1[], int arr2[], int n) {
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>(n);
        for (int i = 0; i < n; i++) {
            if (set.containsKey(arr1[i])) {
                int freq = set.get(arr1[i]);
                freq++;
                set.put(arr1[i], freq);
            } else {
                set.put(arr1[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (set.containsKey(arr2[i])) {
                int freq = set.get(arr2[i]);
                freq--;
                set.put(arr2[i], freq);
            }
        }

        boolean flag = true;

        for (Map.Entry<Integer, Integer> entry : set.entrySet()) {
            if (entry.getValue() != 0) {
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int arr1[];
        int arr2[];
        while (t > 0) {
            int n = scanner.nextInt();
            arr1 = new int[n];
            arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = scanner.nextInt();
            }
            System.out.println(getArrayEquality(arr1, arr2, n) == true ? "1" : "0");
            t--;
        }
        scanner.close();
    }
}