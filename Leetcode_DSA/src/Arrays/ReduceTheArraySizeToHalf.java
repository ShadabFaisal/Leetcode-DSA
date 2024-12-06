package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ReduceTheArraySizeToHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7,7,7,7,7,7};

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		//System.out.println(map);
		List<Integer> freq=new ArrayList<>(map.values());
        Collections.sort(freq, Collections.reverseOrder());
        
        int len=arr.length;
        int i=0;
        int count=0;
        
        while(len>(arr.length)/2){
            len=len-freq.get(i);
            i++;
            count++;
        }
		
		System.out.println(count);
		
	}

}
