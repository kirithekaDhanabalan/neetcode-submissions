class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charOfs = s.toCharArray();
        char[] charOft = t.toCharArray();

        if (charOfs.length != charOft.length) {
            return false;
        }

        Arrays.sort(charOfs);
        Arrays.sort(charOft);

        for (int i = 0; i < charOfs.length; i++) {
            if (charOfs[i] != charOft[i]) {
                return false;
            }
        }
        return true;
    }
}
