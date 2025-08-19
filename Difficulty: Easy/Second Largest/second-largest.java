class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int maxsum=  Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxsum)
            {
                maxsum=arr[i];
            }
        }
            int secondmax= Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++)
            {
            
            if(arr[i]>secondmax && arr[i]<maxsum)
            {
                secondmax=arr[i];
            }
            }
        
      if(secondmax==Integer.MIN_VALUE)
      {
          return -1;
      }
      else return secondmax;
    }
}