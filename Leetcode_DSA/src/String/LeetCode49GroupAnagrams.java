package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode49GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println('c'-'a');
		System.out.println(groupAnagrams(strs));
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
	     
        if(strs==null || strs.length==0)return new ArrayList<>();
        
        HashMap<String, List<String>> map=new HashMap<>();
        
        for(String str:strs){
            String key=buildKey(str);
            List<String> list=map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<>(map.values());
    }
    
    private static String buildKey(String str){
        char[] keyChar=new char[26];
        for(char c: str.toCharArray()){
            keyChar[c-'a']++;
        }
        return new String(keyChar);
    }

}
