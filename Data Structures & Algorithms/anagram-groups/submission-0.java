class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupedAnagram = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if (groupedAnagram.containsKey(key)) {
                groupedAnagram.get(key).add(str);
            } else {
                List<String> strValue = new ArrayList<>();
                strValue.add(str);
                groupedAnagram.put(key, strValue);
            }
        }
        return new ArrayList<>((groupedAnagram.values()));
    }
}
