package chapter3;

import java.util.Stack;

public class Question5 {

    class SortedStack {

        Stack<Integer> stack;
        Stack<Integer> minStack;

        public SortedStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            if(minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }else{
                while (!minStack.isEmpty() && minStack.peek() < val) stack.push(minStack.pop());
                minStack.push(val);
                while (!stack.isEmpty()) minStack.push(stack.pop());
            }

        }

        public void pop() {
            if(!minStack.isEmpty()) minStack.pop();
        }

        public int peek() {
            if(isEmpty()) return -1;
            return minStack.peek();
        }


        public boolean isEmpty() {
            return minStack.isEmpty();
        }
    }
}
