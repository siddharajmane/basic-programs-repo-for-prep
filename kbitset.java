import java.util.*;

public class kbitset {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int one = 1;
        int k = scanner.nextInt();
        if ((n & (one << k - 1)) != 0) {
            System.out.print("set");
        } else {
            System.out.print("unset");
        }
        scanner.close();
    }
}