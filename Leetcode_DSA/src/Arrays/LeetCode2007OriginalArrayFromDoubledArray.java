package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode2007OriginalArrayFromDoubledArray {

	public static void main(String[] args) {
		int[] arr= {1,3,4,2,6,8};
		System.out.println(Arrays.toString(findOriginalArray(arr)));

	}
	public static int[] findOriginalArray(int[] changed) {
        List<Integer> ans=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        Arrays.sort(changed);
        
        
        for(int num: changed){
            if(!queue.isEmpty() && num==queue.peek()){
                queue.poll();
            }
            else{
                queue.offer(num*2);
                ans.add(num);
            }
        }
        return !queue.isEmpty()? new int[] {} : ans.stream().mapToInt(i -> i).toArray();
    }

}
