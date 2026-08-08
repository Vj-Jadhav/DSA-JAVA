class Solution {
    public int sumOfUnique(int[] nums) {
        
       
         int sum = 0;
       HashMap<Integer,Integer> hm = new HashMap<>();

       for(int i : nums){

           hm.put(i,hm.getOrDefault(i, 0)+1);
       }
      
      for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {

    if(entry.getValue() == 1) {
        sum += entry.getKey();
    }
}
       
   return sum;
    }
}