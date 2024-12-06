package StackAndQueue;

import java.util.Stack;

public class LeetCode155MinStack {
	Stack<Integer> stack=null;
    Stack<Integer> minStack=null;

    public LeetCode155MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
