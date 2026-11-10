class Solution {
    public boolean isValid(String s) {
        Stack<Character> stackS = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stackS.push(c);
            } else {
                if (stackS.isEmpty()) {
                    return false;
                }
                char topChar = stackS.peek();
                if ((c == ')' && topChar != '(') || (c == '}' && topChar != '{')
                    || (c == ']' && topChar != '[')) {
                    return false;
                }
                stackS.pop();
            }
        }
        return stackS.isEmpty();
    }
}
