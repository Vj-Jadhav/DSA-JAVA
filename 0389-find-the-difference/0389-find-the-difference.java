class Solution {
    public char findTheDifference(String s, String t) {
        
        int sum = 0;
        int sum1 = 0;
      for(char ch : s.toCharArray()){
            
            sum += ch;

      }  

      for(char ch : t.toCharArray()){

           sum1+= ch;
      }


      char extra = (char) (sum1 - sum);

      return extra;
    }
}