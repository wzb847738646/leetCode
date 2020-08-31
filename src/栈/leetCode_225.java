package 栈;
//使用队列实现栈的下列操作：
//
//
// push(x) -- 元素 x 入栈
// pop() -- 移除栈顶元素
// top() -- 获取栈顶元素
// empty() -- 返回栈是否为空
//
//
// 注意:
//
//
// 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合
//法的。
// 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
// 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
//
// Related Topics 栈 设计
// 👍 219 👎 0
import java.util.LinkedList;
import java.util.Queue;

public class leetCode_225 {
   /** Initialize your data structure here. */
   private Queue queue1;
   private Queue queue2;

   public leetCode_225() {
      queue1 = new LinkedList();
      queue2 = new LinkedList();
   }
   /** Push element x onto stack. */
   public void push(int x) {
      queue1.offer(x);
   }

   /** Removes the element on top of the stack and returns that element. */
   public int pop() {
      int length = queue1.size();
      for (int i = 0; i < length - 1; i++){
         queue2.offer(queue1.poll());
      }
      int result =(int) queue1.poll();

      while (!queue2.isEmpty()){
         queue1.offer(queue2.poll());
      }
      return result;
   }

   /** Get the top element. */
   public int top() {
      int length = queue1.size();
      for (int i = 0; i < length - 1; i++){
         queue2.offer(queue1.poll());
      }
      int result =(int) queue1.poll();

      while (!queue2.isEmpty()){
         queue1.offer(queue2.poll());
      }
      queue1.offer(result);
      return result;
   }

   /** Returns whether the stack is empty. */
   public boolean empty() {
      if (queue1.isEmpty()){
         return true;
      }
      else
         return false;
   }
}
