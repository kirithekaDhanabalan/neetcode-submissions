class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupedAnagram = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }
            String countKey = Arrays.toString(count);

            groupedAnagram.putIfAbsent(countKey, new ArrayList<>());
            groupedAnagram.get(countKey).add(str);
        }
        return new ArrayList<>(groupedAnagram.values());
    }
}
