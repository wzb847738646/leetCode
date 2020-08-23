package 栈;

import java.util.Stack;

public class leetCode_232 {
    private Stack s1 = new Stack();
    private Stack s2 = new Stack();
    /** Initialize your data structure here. */
    public leetCode_232() {
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int length = s1.size();
        if (length == 0){
            return Integer.parseInt(null);
        }
        while (length > 1){
            s2.push(s1.pop());
            length--;
        }
        int temp = (int)s1.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return temp;
    }

    /** Get the front element. */
    public int peek() {
        int length = s1.size();
        if (length == 0){
            return Integer.parseInt(null);
        }
        while (length > 1){
            s2.push(s1.pop());
            length--;
        }
        int temp = (int)s1.peek();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return temp;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }
}
