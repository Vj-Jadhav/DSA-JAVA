class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        
        int left = 0;

        int ans = 0;
        
        for(int right = 0; right < s.length(); right++){

             char ch = s.charAt(right);
            
              hm.put(ch, hm.getOrDefault(ch,0) + 1);

           while(hm.get(ch) > 1){

            char leftchar = s.charAt(left);

            hm.put(leftchar, hm.get(leftchar) - 1);

            left++;

           }

            ans = Math.max(ans,right - left + 1);

        }

        return ans;
    }
}