import java.util.Scanner;

class SumofNumbersinString {
    static int findSum(String str) {
        String temp = "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                sum = sum + Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        System.out.println(findSum(n));

    }
}