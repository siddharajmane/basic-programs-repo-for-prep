import java.util.*;

public class LongestSubarraywithequalzeroandone {
    static int maxSubArray(int[] nums, int sum) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int res = 0;
        int presum = 0;
        for (int i = 0; i < nums.length; i++) {
            presum += nums[i];
            if (presum == sum) {
                // when in special case such as {2,3,1} when you get sum from zero when input
                // sum is 5
                res = i + 1;
            }
            if (!set.containsKey(presum)) {
                // Store the hash map with first occurence
                set.put(presum, i);
            }
            if (set.containsKey(presum - sum)) {
                // here we get compare the length from current to res by minus from form
                // occurence to the i for eg
                // {3 4 4 5 13 15 21} where sum 5 we get 0 so for eg we found at 13 where i = 4
                // so 4-get from hashmap
                res = Math.max(res, i - set.get(presum - sum));
            }
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int n1 = scanner.nextInt();
            if (n1 == 0) {
                arr[i] = -1;
            } else {
                arr[i] = n1;
            }
        }
        int ans = maxSubArray(arr, sum);
        System.out.println(ans);
        scanner.close();
    }
}