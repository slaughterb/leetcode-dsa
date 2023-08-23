class Solution {
    public int searchInsert(int[] nums, int target) {
        // given nums(sorted) we can apply binary search to locate the
        // target in O(logn)
        int l = 0;
        int r = nums.length - 1;
        // edge cases where target is the new min or new max:
        if (target < nums[l]) {
            return 0;
        }
        else if (target > nums[r]) {
            return r + 1;
        }
        int mp = l + (r - l) / 2;

        while (l <= r) {
            // return index if target found, else return where it would be. If neither case
            // occurs, update l and r:
            if (nums[mp] == target) {
                return mp;
            }
            else if (mp < nums.length - 1 && nums[mp] < target && nums[mp + 1] > target) {
                return mp + 1;
            }
            else if (nums[mp] < target) {
                l = mp + 1;
            }
            else if (nums[mp] > target) {
                r = mp - 1;
            }
            mp = l + (r - l) / 2;
        }
        return -1;
    }
}