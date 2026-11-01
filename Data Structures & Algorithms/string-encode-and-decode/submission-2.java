class Solution {
    public String encode(List<String> strs) {
        if (strs.size() == 0)
            return "";

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }

        List<String> resultString = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int delimiterPosition = str.indexOf("#", i);
            int strLength = Integer.parseInt(str.substring(i, delimiterPosition));

            resultString.add(
                str.substring(delimiterPosition + 1, delimiterPosition + strLength + 1));

            i = delimiterPosition + strLength + 1;
        }
        return resultString;
    }
}
