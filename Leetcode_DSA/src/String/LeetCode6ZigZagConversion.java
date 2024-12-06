package String;

import java.util.ArrayList;
import java.util.List;

public class LeetCode6ZigZagConversion {

	public static void main(String[] args) {
		String s="PAYPALISHIRING";
		int numRows=3;
		System.out.println(convert(s,numRows));

	}

	public static String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()){
            return s;
        }

        List<StringBuilder> ans=new ArrayList<>();

       for(int i=0;i<numRows;i++){
           ans.add(new StringBuilder());
       }

        boolean flag=false;
        int row=0;
        for(char ch:s.toCharArray()){
            ans.get(row).append(ch);
            if(row==0 || row==numRows-1){
                flag=!flag;
            }
           row+=flag?1:-1;
        }
        StringBuilder zigzag=new StringBuilder();
        for(StringBuilder str:ans){
            zigzag.append(str);
        }
        return zigzag.toString();
    }
}
