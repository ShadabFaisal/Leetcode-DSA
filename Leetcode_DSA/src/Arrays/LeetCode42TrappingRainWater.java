package Arrays;

public class LeetCode42TrappingRainWater {

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trap(height));
	}

	public static int trap(int[] height) {
		int n = height.length;
		int left = 0, right = n - 1;
		int res = 0;
		int leftMax = 0, rightMax = 0;

		while (left <= right) {
			if (height[left] <= height[right]) {
				if (height[left] >= leftMax)
					leftMax = height[left];
				else
					res += leftMax - height[left];

				left++;
			} else {
				if (height[right] >= rightMax)
					rightMax = height[right];
				else
					res += rightMax - height[right];

				right--;
			}
		}
		return res;
	}
	
	public int trap2(int[] height) {
        if(height.length<3){
            return 0;
        }
        int[] leftMax=new int[height.length];
        int[] rightMax=new int[height.length];

        leftMax[0]=0;rightMax[rightMax.length-1]=0;

        for(int i=1;i<leftMax.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i-1]);
        }

        for(int i=rightMax.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i+1]);
        }
        int trapped=0;
        for(int i=1;i<height.length-1;i++){
            if(Math.min(leftMax[i],rightMax[i])>height[i]){
                trapped+=Math.min(leftMax[i],rightMax[i])-height[i];
            }
        }
       return trapped; 
    }

}
