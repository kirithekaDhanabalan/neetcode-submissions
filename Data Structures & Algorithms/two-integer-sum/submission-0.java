class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultant = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    resultant[0] = i;
                    resultant[1] = j;
                }
            }
        }
        return resultant;
    }
}
