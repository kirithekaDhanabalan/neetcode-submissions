class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] resultArr = new int[len];
        int prefix = 1;
        for (int i = 0; i < len; i++) {
            resultArr[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;
        for (int i = len - 1; i >= 0; i--) {
            resultArr[i] = suffix * resultArr[i];
            suffix = suffix * nums[i];
        }

        return resultArr;
    }
}
