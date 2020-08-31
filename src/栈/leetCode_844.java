package 栈;

import java.util.Stack;

public class leetCode_844 {
    public static Stack<String> change(String s){
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++){
            String temp = String.valueOf(s.charAt(i));
            if (temp.equals("#")){
                if (stack.isEmpty()){
                }
                else
                    stack.pop();
            }
            else {
                stack.push(temp);
            }
        }
        return stack;
    }
}
