class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alphaArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphaArray[s.charAt(i) - 'a']++;
            alphaArray[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < alphaArray.length; i++) {
            if (alphaArray[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
