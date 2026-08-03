class Solution {
    public int majorityElement(int[] nums) {
        int count;
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}