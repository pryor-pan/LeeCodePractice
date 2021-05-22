package com.stacks;

import java.util.Stack;

/**
 * Remarks: 682. 棒球比赛
 *              你现在是一场采用特殊赛制棒球比赛的记录员。这场比赛由若干回合组成，过去几回合的得分可能会影响以后几回合的得分。
 *              比赛开始时，记录是空白的。你会得到一个记录操作的字符串列表 ops，其中 ops[i] 是你需要记录的第 i 项操作，ops 遵循下述规则：
 *
 *              整数 x - 表示本回合新获得分数 x
 *              "+" - 表示本回合新获得的得分是前两次得分的总和。题目数据保证记录此操作时前面总是存在两个有效的分数。
 *              "D" - 表示本回合新获得的得分是前一次得分的两倍。题目数据保证记录此操作时前面总是存在一个有效的分数。
 *              "C" - 表示前一次得分无效，将其从记录中移除。题目数据保证记录此操作时前面总是存在一个有效的分数。
 *              请你返回记录中所有得分的总和。
 *
 * Author:panlai
 * :Date:2021/4/27
 */
public class No682_CalPoints {
    public int calPoints(String[] ops) {
        return 0;
    }

    public static int func(String[] ops){
        Stack<Integer> stack = new Stack<>();

        for (String string:ops) {
            if (string.equals("+")){
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            }else if (string.equals("D")){
                stack.push(2*stack.peek());
            }else if (string.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.valueOf(string));
            }
        }
        int sum = 0;
        for (int i:stack) {
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] strings = {"5","2","C","D","+"};
        System.out.println(func(strings));

    }
}
