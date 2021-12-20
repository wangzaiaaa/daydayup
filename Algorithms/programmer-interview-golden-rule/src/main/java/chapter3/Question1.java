package chapter3;

import java.util.Stack;

public class Question1 {


    private Stack<Integer> stack = new Stack<>();

    private Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()) minStack.push(x);
        else{
            int min = Integer.min(x,minStack.peek());
            minStack.push(min);
        }

    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
