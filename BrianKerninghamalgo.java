import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

//used for count bit set for 11001 so count is 3 

public class BrianKerninghamalgo {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger b = new BigInteger(br.readLine());
        long res = 0;
        long n = b.longValue();
        while (n > 0) {
            n = n & (n - 1);
            res++;
        }
        System.out.print(res);

    }
}