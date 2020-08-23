package 堆;

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
public class 堆 {
    /** initialize your data structure here. */
    private int currentSize;
    private static final int DEFAULT_CAPACITY = 10;
    private int[] array;

    public 堆() {
        array = new int[DEFAULT_CAPACITY];
    }

    private void enlargeArray(int newSize){
        int[] new_array = new int[newSize];
        for (int i = 0; i <array.length; i++){
            new_array[i] = array[i];
        }
        array = new_array;
    }

    public void push(Integer x) {
        if (currentSize == array.length-1){
            enlargeArray(array.length * 2 + 1);
        }

        currentSize++;
        array[0] = x;
        int hole;
        for (hole = currentSize; x.compareTo(array[hole/2]) < 0; hole /= 2){
            array[hole] = array[hole/2];
        }
        array[hole] = x;
    }

    public void pop() {
        delete(1);
    }

    private void delete(int index){
        if (2 * index > currentSize){
            array[index] = 0;
        }
        else if (2 * index == currentSize){
            array[index] = array[2*index];
            array[2*index] = 0;
        }
        else {
            int temp = array[2*index] - array[2*index+1] < 0 ? (2*index):(2*index+1);
            array[index] = array[temp];
            delete(temp);
        }
    }

    public int top() {
        return array[1];
    }

    public int getMin() {
        return array[1];
    }
}
