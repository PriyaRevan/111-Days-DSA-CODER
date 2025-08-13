// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        int sum = 0;

       
        while (n > 0) {
            int n2 = n % 10;
            sum += n2;
            n = n / 10; 
        }


        int temp = sum;
        int rev = 0;
        while (temp > 0) {
            int n2 = temp % 10; 
            rev = rev * 10 + n2; 
            temp = temp / 10;    
        }

       
        return rev == sum; 
    }
}
