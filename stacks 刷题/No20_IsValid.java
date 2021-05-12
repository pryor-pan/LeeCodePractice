package com.stacks;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Remarks: 20. 有效的括号 括号匹配的问题
 *              给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *              有效字符串需满足：
 *              左括号必须用相同类型的右括号闭合。
 *              左括号必须以正确的顺序闭合。
 *
 *              输入：s = "()"
 *              输出：true
 *
 *              提示：一般跟顺序有关系的  都跟栈脱不开关系
 *
 * Author:panlai
 * :Date:2021/4/28
 */
public class No20_IsValid {
    public boolean isValid(String s) {
        if (s == null){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '('||ch == '{'|| ch =='['){
                stack.push(ch);
            }else{
                if (stack.isEmpty()){
                    System.out.println("右括号多");
                    return false;
                }else{
                    char top = stack.peek();
                    if (ch == ')' && top =='('||ch == '}' && top =='{'||ch == ']' && top =='['){
                        stack.pop();
                    }else{
                        System.out.println("左右括号不匹配");
                        return false;
                    }

                }
            }
        }
        if (!stack.isEmpty()){
            System.out.println("左括号多");
            return false;
        }
        return true;
    }





}
