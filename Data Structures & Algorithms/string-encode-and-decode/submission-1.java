class Solution {
    public String encode(List<String> strs) {
        String resultStr = new String();
        for (String s : strs) {
            s = (s.length() + "#" + s);
            resultStr = resultStr + s;
        }
        return resultStr;
    }

    public List<String> decode(String str) {
        List<String> resultStrList = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int delimiter = str.indexOf("#", i);
            int position = Integer.parseInt(str.substring(i, delimiter));

            String actualStr = str.substring(delimiter + 1, delimiter + 1 + position);
            resultStrList.add(actualStr);

            i = delimiter + position + 1;
        }
        return resultStrList;
    }
}
