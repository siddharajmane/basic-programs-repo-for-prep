import java.util.ArrayList;
import java.util.*;

public class candiesproblem {

    public static int solve(int n) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        while (list.size() >= 2) {
            int a = list.get(0);
            int b = list.get(1);
            list.remove(0);
            list.remove(0);
            list.add(0, a + b);
        }
        sc.close();
        return list.get(0);
    }

    public static void main(String args[]) {

        ArrayList<Integer> output = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            output.add(solve(n));
        }
        for (Integer integer : output) {
            System.out.println(integer);
        }
    }
}