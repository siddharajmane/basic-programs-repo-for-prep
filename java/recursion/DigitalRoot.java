package java.recursion;

/*Fibonacci Using Recursion

You are given a number n. You need to find nth Fibonacci number.
F(n)=F(n-1)+F(n-2); where F(1)=1 and F(2)=1

Input:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains one line of input containing n.

Output:
For each testcase, in a newline, print F(n).

Your Task:
This is a function problem. You only need to complete the function fibonacci that takes n as parameters and returns F(n).

Constraints:
1 <= T <= 20
1 <= n <= 20

Examples:
Input:
2
1
20
Output:
1
6765

Explanation:
Testcase 1: 1st fibonacci number is 1.
Testcase 2: 20th fibonacci number is 6765.

 
** For More Input/Output Examples Use 'Expected Output' option **
*/

class Digital {
    public static int getDigitSum(int n) {
        if (n < 10) {
            return n;
        } else {
            return getDigitSum(n / 10) + (n % 10);
        }
    }

    // complete the function
    public static int digitalRoot(int n) {
        if (n / 10 == 0) {
            return n;
        } else {
            return digitalRoot(getDigitSum(n));
        }
    }
}
