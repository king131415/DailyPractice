package javaDailyProctice.Test0730;

import java.util.Stack;

/**
 * 两个栈实现一个队列
 */


public class Test0730_1 {
    //作为入队列的栈
    Stack<Integer> stack1 = new Stack<Integer>();
    //作为出队列的栈
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        //先要判断出队列的栈是否为空，若为不为空就要全部压入入队列的栈
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        //添加入队列的元素
        stack1.push(node);
    }

    public int pop() {
        //出队列前要判断入队列的栈是否为空，若不为空，就要全部压入出队列的栈
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        //出队列
        return stack2.pop();

    }
    public static void main(String[] args) {
        new Test0730_1();

    }
}
