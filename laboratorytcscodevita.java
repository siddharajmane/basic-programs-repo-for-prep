import java.util.*;

public class laboratorytcscodevita {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> output = new ArrayList<>();

        int n = sc.nextInt();
        int arr[] = new int[n];
        int t = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l1 = 0;
        int l2 = 0;
        for (int i = 0; i < t; i++) {
            l1 = sc.nextInt();
            l2 = sc.nextInt();
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] >= l1 && arr[j] <= l2) {
                    count++;
                }
            }
            output.add(count);
        }
        for (int i : output) {
            System.out.print(i + " ");
        }

    }

}