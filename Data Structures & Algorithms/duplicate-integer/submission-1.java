class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashNums = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hashNums.add(nums[i]);
        }
        if (hashNums.size() != nums.length) {
            return true;
        }
        return false;
    }
}