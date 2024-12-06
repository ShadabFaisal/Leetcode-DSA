package MathAndGeometry;

public class LeetCode223RectangleArea {

	public static void main(String[] args) {
		 int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
		 System.out.println(computeArea(ax1,ay1,ax2,ay2,bx1,by1,bx2,by2));

	}

	public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

		int area1 = (ax2 - ax1) * (ay2 - ay1);
		int area2 = (bx2 - bx1) * (by2 - by1);

		int left = Math.max(bx1, ax1);
		int right = Math.min(bx2, ax2);

		int top = Math.min(ay2, by2);
		int bot = Math.max(ay1, by1);

		int overlapArea = 0;

		if (right > left && top > bot) {
			overlapArea = (right - left) * (top - bot);
		}

		return area1 + area2 - overlapArea;
	}

}
