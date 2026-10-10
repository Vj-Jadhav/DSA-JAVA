class Solution {
    public int[] searchRange(int[] nums, int target) {
        
       
      int first = lowerBoound(nums,target);
      int last =  upperBound(nums,target) - 1;

      if(first == nums.length || nums[first] != target){

       return new int[]{-1,-1};

      }

      return new int[]{first,last};
      
    }

    static int lowerBoound(int [] nums, int target){

        int left = 0;
        int right = nums.length;

        while(left < right){

            int mid = left + (right - left)/2;

            if(nums[mid] >= target){

                right = mid;

            }else{

                left = mid + 1;
            }
        }
        return left;
    }

     static int upperBound(int [] nums, int target){

        int left = 0;
        int right = nums.length;

        while(left < right){

            int mid = left + (right - left)/2;

            if(nums[mid] > target){

                right = mid;

            }else{

                left = mid + 1;
            }
        }
        return right;
    }
}