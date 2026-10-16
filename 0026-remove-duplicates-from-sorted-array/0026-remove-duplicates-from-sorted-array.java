class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1; // next unique element yahan likhna hai

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}