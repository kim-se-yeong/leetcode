class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            tmp++;
            if (target <= nums[i]) {
                return i;
            }
        }
        return tmp;
    }
}