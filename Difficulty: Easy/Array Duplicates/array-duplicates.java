class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        //codeint n=arr.length;
        ArrayList<Integer> List=new ArrayList<>();
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(Map.Entry <Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue()==2)
              List.add(entry.getKey());
        } 
        return List;
        
    }
}