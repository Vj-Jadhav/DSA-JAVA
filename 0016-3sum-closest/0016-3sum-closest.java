class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int n = nums.length;

        Arrays.sort(nums);

        int closest = nums[0] +  nums[1] + nums[2];

        for(int k = 0; k < n; k++){

            int left = k+1;
            int right = n - 1;

            while(left < right){

               int sum = nums[left] + nums[right] + nums[k];

               if(Math.abs(target - sum) < Math.abs(target - closest)){

                   closest = sum;
               }

               if(sum == target){
                  
                  return sum;

               }else if(sum < target){
                    
                    left++;
                  
                  
               }else{

                  right--;
               }
            }
        }

        return closest;
    }
}