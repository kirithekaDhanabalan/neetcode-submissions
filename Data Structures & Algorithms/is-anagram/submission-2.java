class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] charOfs = s.toCharArray();
        char[] charOft = t.toCharArray();

        Arrays.sort(charOfs);
        Arrays.sort(charOft);

        return Arrays.equals(charOfs, charOft);
    }
}
