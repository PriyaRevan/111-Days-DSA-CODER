class Solution {
    int missingNum(int arr[]) {
        // code here
        int n= arr.length+1;
      long total=(long) n*(n+1)/2;
        long sum=0;
       
        for(int i =0;i<n-1;i++)
        {
             sum +=arr[i];
        
        }
          return    (int) (total-sum) ;
        
         
    }
   
}