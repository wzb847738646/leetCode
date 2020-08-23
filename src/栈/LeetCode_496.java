package 栈;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class LeetCode_496 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] answer = nextGreaterElement(nums1,nums2);
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList answer = new ArrayList();
        for (int i = 0; i< nums1.length;i++){
            answer.add(compare(nums1[i],nums2));
        }
        int[] sl = new int[answer.size()];
        for (int i = 0; i < sl.length; i++){
            sl[i] = (int)answer.get(i);
        }
        return sl;
    }

    private static int compare(int x, int[] num){
        Stack s1 = new Stack();
        for (int i = num.length-1; i >= 0; i--){
            if (num[i] > x){
                s1.push(num[i]);
            }
            if (num[i] == x){
                break;
            }
        }
        if (s1.isEmpty()){
            return -1;
        }
        else {
            return (int) s1.pop();
        }
    }
}
