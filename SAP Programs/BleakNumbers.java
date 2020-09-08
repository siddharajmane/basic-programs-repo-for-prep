import java.io.*;

class BleakNumbers {

    /*
     * Function to get no of set bits in binary representation of passed binary no.
     */
    static int countSetBits(int x) {
        int count = 0;
        while (x > 0) {
            count += x & 1;
            x >>= 1;
        }
        return count;
    }

    // Returns true if n is Bleak
    static boolean isBleak(int n) {
        // Check for all numbers 'x' smaller
        // than n. If x + countSetBits(x)
        // becomes n, then n can't be Bleak
        for (int x = 1; x < n; x++)
            if (x + countSetBits(x) == n)
                return false;

        return true;
    }

    // Driver code
    public static void main(String args[]) {
        if (isBleak(3))
            System.out.println("Yes");
        else
            System.out.println("No");
        if (isBleak(4))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
