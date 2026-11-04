class Solution {
    public boolean isPalindrome(String s) {
        String s1 = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                s1 = s1 + Character.toLowerCase(c);
            }
        }

        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(s1.charAt(i))) {
                char c = s1.charAt(i);
                s2 = s2 + Character.toLowerCase(c);
            }
        }
        return s1.equals(s2);
    }
}
