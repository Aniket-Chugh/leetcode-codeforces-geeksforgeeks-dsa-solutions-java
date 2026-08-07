class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
  for(int i=nums1.length-1;i>=n;i--){
    nums1[i] = nums1[i-n];
  }

    for(int i=0;i<nums2.length;i++){
    nums1[i] = nums2[i];
  }
Arrays.sort(nums1);
    }
}