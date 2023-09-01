class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> flag = new HashMap<Integer, Boolean>();
        for (int i = 0; i < nums.length; i++) {
            if (flag.get(nums[i]) != null) {
                return true;
            }
            flag.put(nums[i], true);
        }
        return false;
    }
}