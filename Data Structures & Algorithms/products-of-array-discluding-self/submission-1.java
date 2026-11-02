class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefixArr = new int[len];
        int prefix = 1;
        for (int i = 0; i < len; i++) {
            prefixArr[i] = prefix;
            prefix = prefix * nums[i];
        }

        int[] suffixArr = new int[len];
        int suffix = 1;
        for (int i = len - 1; i >= 0; i--) {
            suffixArr[i] = suffix * prefixArr[i];
            suffix = suffix * nums[i];
        }

        return suffixArr;
    }
}
