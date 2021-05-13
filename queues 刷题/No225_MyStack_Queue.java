package com.queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Remarks:     225. 用队列实现栈
 *                  两个队列
 *                  入栈的时候往哪个不为空的队列里放
 *                  出栈的时候吧前面的几个放到另一个队列，然后再把要出栈的元素出了。
 * Author:panlai
 * :Date:2021/4/28
 */
public class No225_MyStack_Queue {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public No225_MyStack_Queue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (!queue1.isEmpty()){
            queue1.offer(x);
        }else if (!queue2.isEmpty()){
            queue2.offer(x);
        }else{
            queue1.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (empty()){
            return -1;
        }
        if (!queue1.isEmpty()){
            int ret = -1;
            int len = queue1.size();
            for (int i = 0; i < len-1; i++) {
                ret = queue1.poll();
                queue2.offer(ret);
            }
            return queue1.poll();
        }else{
            int ret = -1;
            int len = queue1.size();
            for (int i = 0; i < len-1; i++) {
                ret = queue2.poll();
                queue1.offer(ret);
            }
            return queue2.poll();
        }
    }

    /** Get the top element. */
    public int top() {
        if (empty()){
            return -1;
        }
        if (!queue1.isEmpty()){
            int ret = -1;
            int len = queue2.size();
            for (int i = 0; i < len; i++) {
                ret = queue1.poll();
                queue2.offer(ret);
            }
            return ret;
        }else{
            int ret = -1;
            int len = queue2.size();
            for (int i = 0; i < len; i++) {
                ret = queue2.poll();
                queue1.offer(ret);
            }
            return ret;
        }
    }
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty()&&queue2.isEmpty();
    }
}
