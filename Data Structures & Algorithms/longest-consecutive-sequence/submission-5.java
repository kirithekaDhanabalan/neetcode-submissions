class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> hashsetNums = new HashSet<>();
        for (int num : nums) {
            hashsetNums.add(num);
        }

        int maxSeqCounter = 1;
        for (int num : nums) {
            if (!hashsetNums.contains(num - 1)) {
                int currentSeqCounter = 1;
                int i = 1;
                while (hashsetNums.contains(num + i)) {
                    currentSeqCounter++;
                    maxSeqCounter = Math.max(maxSeqCounter, currentSeqCounter);
                    i++;
                }
            }
        }
        return maxSeqCounter;
    }
}
