class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // given: nums[i] element of [1,n]: find all numbers within that range that
        // aren't part of nums
        List<Integer> missing = new ArrayList<Integer>();
        // hashmap to keep track of occurrences:
        HashMap<Integer,Boolean> counts = new HashMap<Integer, Boolean>();

        for (int i = 0; i < nums.length; i++) {
            if (counts.get(nums[i]) == null) {
                counts.put(nums[i], true);
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (counts.get(i) == null) {
                missing.add(i);
            }
        }
        return missing;
    }
}