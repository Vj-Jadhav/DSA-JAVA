
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i];

            twoSum(list, nums, target, i + 1, n - 1);
        }

        return list;
    }

    static void twoSum(List<List<Integer>> list, int[] nums,
                       int target, int i, int j) {

        while (i < j) {

            int sum = nums[i] + nums[j];

            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {

                list.add(Arrays.asList(-target, nums[i], nums[j]));

                while (i < j && nums[i] == nums[i + 1]) {
                    i++;
                }

                while (i < j && nums[j] == nums[j - 1]) {
                    j--;
                }

                i++;
                j--;
            }
        }
    }
}
