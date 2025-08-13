class Solution {
    static boolean armstrongNumber(int n) {
        int sum = 0;
        int temp = n; // store original number

        while (n > 0) {
            int n1 = n % 10;
            sum += n1 * n1 * n1; // accumulate cubes
            n = n / 10;
        }

        return sum == temp; // compare to original
    }
}
