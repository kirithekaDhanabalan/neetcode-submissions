class Solution {
    public int maxArea(int[] heights) {
        int resultArea = 0;

        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int length = right - left;
            int height = Integer.min(heights[left], heights[right]);

            int area = length * height;

            if (resultArea < area) {
                resultArea = area;
            }
            if (heights[left] < heights[right]) {
                left++;
            } else if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return resultArea;
    }
}
