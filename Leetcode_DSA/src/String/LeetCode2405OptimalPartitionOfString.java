package String;

import java.util.HashSet;
import java.util.Set;

public class LeetCode2405OptimalPartitionOfString {

	public static void main(String[] args) {
		String s = "abacaba";
		System.out.println(partitionString(s));

	}
	public static int partitionString(String s) {
        int count=0;
        Set<Character> set=new HashSet<>();

        for(char c: s.toCharArray()){
            if(set.contains(c)){
                count++;

                //reset the hashset once we find character present in the set already
                set=new HashSet<>();
                set.add(c);
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty())count++;
        return count;

    }

}
