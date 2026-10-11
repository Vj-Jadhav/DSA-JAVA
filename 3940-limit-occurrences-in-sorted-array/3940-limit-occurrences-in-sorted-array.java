class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
      
      int n = nums.length;
        
      int i = 0;

      for(int j = 0; j < n; j++){

         if(i < k || nums[j] != nums[i - k]){

            nums[i] = nums[j];

            i++;
         }
      }
      
      return Arrays.copyOf(nums, i);
    }
}