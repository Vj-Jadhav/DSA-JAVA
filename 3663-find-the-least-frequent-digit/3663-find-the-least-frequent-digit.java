class Solution {
    public int getLeastFrequentDigit(int n) {

        HashMap<Integer, Integer> hm = new HashMap<>();


        while(n > 0){

            int digit = n%10;
             hm.put(digit,hm.getOrDefault(digit,0)+1);
             n = n/10;
        }
        
         int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int key : hm.keySet()){
         
           int frequent = hm.get(key);

           if(frequent < min){

               min = frequent;

               ans = key;
           }

        }

        return ans;

        
    }
}