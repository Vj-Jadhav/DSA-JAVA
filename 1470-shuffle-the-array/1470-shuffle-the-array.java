class Solution {
    public int[] shuffle(int[] nums, int n) {

        int m = nums.length;
        int [] ans = new int[m];
         
        int indx = 0;

        for(int i = 0; i < n; i++){
           
           ans[indx++] = nums[i];
           ans[indx++] = nums[i + n];

        }

        return ans;
        
    }
}