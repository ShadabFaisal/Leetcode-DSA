package Arrays;

public class LeetCode11ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
	
	 public static int maxArea(int[] height) {
	        int water=0,left=0,right=height.length-1;

	        while(left<right){
	            water=Math.max(water,Math.min(height[left],height[right])*(right-left));
	            if(height[left]>height[right]){
	                right--;
	            }
	            else{
	                left++;
	            }
	        }
	        return water;
	    }

}
