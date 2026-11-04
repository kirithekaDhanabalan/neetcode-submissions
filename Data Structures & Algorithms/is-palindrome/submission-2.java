class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char sLeft = s.charAt(left);
            char sRight = s.charAt(right);
            if (Character.isLetterOrDigit(sLeft)) {
                sLeft = Character.toLowerCase(sLeft);
            } else {
                left++;
                continue;
            }

            if (Character.isLetterOrDigit(sRight)) {
                sRight = Character.toLowerCase(sRight);
            } else {
                right--;
                continue;
            }
            if (sLeft == sRight) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
