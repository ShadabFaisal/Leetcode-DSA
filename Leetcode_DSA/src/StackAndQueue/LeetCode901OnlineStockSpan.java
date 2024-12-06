package StackAndQueue;

import java.util.Stack;

public class LeetCode901OnlineStockSpan {

	 private Stack<int[]> s;
	    public LeetCode901OnlineStockSpan() {
	        s=new Stack<>();
	    }
	    
	    public int next(int price) {
	        int span=1;
	        while(!s.isEmpty() && s.peek()[1]<=price){
	            span+=s.pop()[0];
	        }
	        s.add(new int[]{span,price});
	        
	        return span;
	    }

}
