class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char sLeft = s.charAt(left);
            char sRight = s.charAt(right);
            if (!Character.isLetterOrDigit(sLeft)) {
                left++;
            } else if (!Character.isLetterOrDigit(sRight)) {
                right--;
            } else {
                if (Character.toLowerCase(sLeft) != Character.toLowerCase(sRight))
                    return false;
                left++;
                right--;
            }
        }
        return true;
    }
}
