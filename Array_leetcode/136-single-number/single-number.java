class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int i = 0;

        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                i += 2;
            } else {
                ans = nums[i];
                break;
            }
        }

        if (i == nums.length - 1) {
            ans = nums[i];
        }

        return ans;
    }
}