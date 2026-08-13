class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        int count = 0;
        for(char ch : s.toCharArray()){

             hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(int i = 0; i < s.length() ; i++){

            if(1 == hm.get(s.charAt(i))){

                return i;


            }
        }

        return -1;
    }
}