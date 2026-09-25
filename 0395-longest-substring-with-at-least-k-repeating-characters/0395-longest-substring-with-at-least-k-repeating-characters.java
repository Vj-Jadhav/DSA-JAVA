class Solution {
    public int longestSubstring(String s, int k) {

        if(s.length() < k){

            return 0;
        }

     HashMap<Character, Integer> hm = new HashMap<>();

     for(char ch : s.toCharArray()){

        hm.put(ch,hm.getOrDefault(ch,0) + 1);

     }  

     for(int i = 0; i < s.length(); i++){

          char ch = s.charAt(i);

        if(hm.get(ch) < k){

           String left = s.substring(0,i);
           String right = s.substring(i + 1);

           return Math.max(
                longestSubstring(left,k),
                longestSubstring(right,k)
           );
        }
     } 
     return s.length();
    }
}