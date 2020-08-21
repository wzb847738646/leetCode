package 栈;

import java.nio.BufferUnderflowException;
import java.util.Stack;

//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
//
//
// push(x) —— 将元素 x 推入栈中。
// pop() —— 删除栈顶的元素。
// top() —— 获取栈顶元素。
// getMin() —— 检索栈中的最小元素。
//
//
//
//
// 示例:
//
// 输入：
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//输出：
//[null,null,null,null,-3,null,0,-2]
//
//解释：
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
//
//
//
//
// 提示：
//
//
// pop、top 和 getMin 操作总是在 非空栈 上调用。
//
// Related Topics 栈 设计
// 👍 643 👎 0
public class leetCode_155 {
   private Stack data;
   private Stack helper;

   public leetCode_155(){
       data = new Stack();
       helper = new Stack();
   }


    public void push(int x) {
        if (data.empty()){
            data.push(x);
            helper.push(x);
        }
        else {
            data.push(x);
            if (x <= (int) helper.peek()){
                helper.push(x);
            }
        }
    }

    public void pop() {
        if (data.empty()){
            return;
        }
       if ((int)data.peek() == (int)helper.peek()){
           data.pop();
           helper.pop();
       }
       else {
           data.pop();
       }
    }


    public int top() {
       if (data.empty()){
           return Integer.parseInt(null);
       }
      return (int)data.peek();
    }

    public int getMin() {
        if (data.empty()){
            return Integer.parseInt(null);
        }
       return (int)helper.peek();
    }

}
