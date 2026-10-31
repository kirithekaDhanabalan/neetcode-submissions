class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numFreqMap = new HashMap<>();

        for (int num : nums) {
            numFreqMap.putIfAbsent(num, 0);
            numFreqMap.put(num, numFreqMap.get(num) + 1);
        }

        List<Map.Entry<Integer, Integer>> entrySetList = new ArrayList<>(numFreqMap.entrySet());
        entrySetList.sort((a, b) -> b.getValue() - a.getValue());

        int[] resultArr = new int[k];

        for (int i = 0; i < k; i++) {
            resultArr[i] = entrySetList.get(i).getKey();
        }
        return resultArr;
    }
}
