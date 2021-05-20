package com.stacks;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Remarks:     150. 逆波兰表达式求值
 *                  有效的算符包括 +、-、*、/ 。每个运算对象可以是整数，
 *                  也可以是另一个逆波兰表达式。
 *                  说明：
 *
 *                  整数除法只保留整数部分。
 *                  给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 *                  输入：tokens = ["2","1","+","3","*"]
 *                  输出：9
 *                  解释：该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9
 *
 * Author:panlai
 * :Date:2021/4/28
 */
public class No150_EvalRPN {
    public static boolean isNumber(String string){
        return !("+".equals(string)||"-".equals(string)||"*".equals(string)||"/".equals(string));
    }
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        int n = tokens.length;
        for (int i = 0; i < n; i++) {
            String str = tokens[i];
            if (isNumber(str)){
                stack.push(Integer.parseInt(str));
            }else{
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (str){
                    case "+":
                        stack.push(num1+ num2);
                         break;
                    case " -":
                        stack.push(num1 - num2);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        stack.push(num1 / num2);
                        break;
                    default:
                }
            }
        }
        return stack.pop();
    }


    public static void main(String[] args) {

    }
}
