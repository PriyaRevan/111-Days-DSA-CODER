class Solution {
    public int countDigits(int n) {
        // code here
       
      int count = (int) (Math.log10(Math.abs(n))) + 1; 
           return count;
    }
}
