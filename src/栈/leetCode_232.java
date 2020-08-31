package 栈;
//使用栈实现队列的下列操作：
//
//
// push(x) -- 将一个元素放入队列的尾部。
// pop() -- 从队列首部移除元素。
// peek() -- 返回队列首部的元素。
// empty() -- 返回队列是否为空。
//
//
//
//
// 示例:
//
// MyQueue queue = new MyQueue();
//
//queue.push(1);
//queue.push(2);
//queue.peek();  // 返回 1
//queue.pop();   // 返回 1
//queue.empty(); // 返回 false
//
//
//
// 说明:
//
//
// 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
//
// 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
// 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。
//
// Related Topics 栈 设计
// 👍 222 👎 0
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
