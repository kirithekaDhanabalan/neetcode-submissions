class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueAndPosition = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            valueAndPosition.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int searchValue = target - nums[j];
            if (valueAndPosition.containsKey(searchValue)
                && valueAndPosition.get(searchValue) != j) {
                return new int[] {j, valueAndPosition.get(searchValue)};
            }
        }
        return new int[] {};
    }
}
