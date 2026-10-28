class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashNums = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashNums.contains(nums[i])) {
                return true;
            }
            hashNums.add(nums[i]);
        }
        return false;
    }
}