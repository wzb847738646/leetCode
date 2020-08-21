package 栈;

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
