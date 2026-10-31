class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFreqMap = new HashMap<>();
        for (int num : nums) {
            numFreqMap.put(num, numFreqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeapPq =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entryMap : numFreqMap.entrySet()) {
            minHeapPq.offer(entryMap);
        }

        while (minHeapPq.size() > k) {
            minHeapPq.poll();
            continue;
        }

        int[] resultArr = new int[k];
        for (int i = 0; i < k; i++) {
            resultArr[i] = minHeapPq.poll().getKey();
        }
        return resultArr;
    }
}
