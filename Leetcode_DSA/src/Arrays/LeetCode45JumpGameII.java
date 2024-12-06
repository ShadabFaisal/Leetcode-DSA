package Arrays;

public class LeetCode45JumpGameII {

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		System.out.println(jump(nums));

	}
	public static int jump(int[] nums) {
        int farthest=0,jump=0,current=0;

        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==current){
                current=farthest;
                jump++;
            }
        }
        return jump;
    }

}
