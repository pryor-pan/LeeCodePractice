package com.stacks;

import com.sun.javafx.image.impl.IntArgb;

import java.util.Stack;

/**
 * Remarks: 232. 用栈实现队列
 *
 *
 * Author:panlai
 * :Date:2021/4/28
 */
public class No232_MyQueue_Stack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public No232_MyQueue_Stack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (empty()){
            return -1;
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (empty()){
            return -1;
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {

        return stack1.isEmpty()&&stack2.isEmpty();
    }


}
