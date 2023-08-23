class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mp = l + (r - l) / 2;
        while (l <= r) {
            if (nums[mp] == target) {
                return mp;
            }
            else if (nums[mp] < target) {
                l = mp + 1;
            }
            else {
                r = mp - 1;
            }
            mp = l + (r - l) / 2;
        }
        return -1;
    }
}