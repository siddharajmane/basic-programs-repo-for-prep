import java.util.*;

public class StringwordReverse {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String tukde[] = input.split(" ");
        String output = "";
        for (int i = tukde.length - 1; i >= 0; i--) {
            output += tukde[i] + " ";
        }
        System.out.println(output);

    }
}