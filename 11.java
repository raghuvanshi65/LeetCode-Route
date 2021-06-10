class Solution {
	public int maxArea(int[] height) {
		int len = height.length;
		int p1 = 0, p2 = len - 1;
		int maxarea = 0;
		while (p1 < p2) {
			if (height[p1] < height[p2]) {
				int area = height[p1] * (p2 - p1);
				maxarea = Math.max(maxarea, area);
				p1++;
			} else {
				int area = height[p2] * (p2 - p1);
				maxarea = Math.max(maxarea, area);
				p2--;
			}
		}
		return maxarea;
	}
}