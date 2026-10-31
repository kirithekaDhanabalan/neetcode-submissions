class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeapPq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> entrySet : freqMap.entrySet()) {
            maxHeapPq.offer(entrySet);
        }

        int[] resultArr = new int[k];
        for (int i = 0; i < k; i++) {
            resultArr[i] = maxHeapPq.poll().getKey();
        }
        return resultArr;
    }
}
