// User function Template for Java

class Solution {
    public int[] findSum(int n) {
        // Code here
        int evensum=0;
        int oddsum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                oddsum=oddsum+i;
            }
          else
          {
                evensum=evensum+i;
            }
            
        }
       return new int[]{oddsum, evensum};
    }
}