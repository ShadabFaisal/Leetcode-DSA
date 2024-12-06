package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCode451SortCharactersByFrequency {

	public static void main(String[] args) {
		String s="tree";
		System.out.println(frequencySort(s));		

	}
	 public static String frequencySort(String s) {
	        
	        HashMap<Character,Integer> map=new LinkedHashMap<>();
	        StringBuilder ans=new StringBuilder();
	        
	        for(char c:s.toCharArray()){
	            map.put(c,map.getOrDefault(c,0)+1);
	        }
	        
	        	map.entrySet().stream().sorted(Map.Entry.<Character,Integer> comparingByValue().reversed()).forEach(record->{
				char key=record.getKey();
				int value=record.getValue();
				for (int i = 0; i < value; i++) {
					ans.append(key);
				}
			});
	        return ans.toString();
	        
	    }

}
