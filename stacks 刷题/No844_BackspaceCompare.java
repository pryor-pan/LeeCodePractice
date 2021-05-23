package com.stacks;

/**
 * Remarks:  844. 比较含退格的字符串
 *          给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 *          注意：如果对空文本输入退格字符，文本继续为空。
 *          输入：S = "ab#c", T = "ad#c"
 *          输出：true
  *         解释：S 和 T 都会变成 “ac”。
 *
 *
 * Author:panlai
 * :Date:2021/4/27
 */
public class No844_BackspaceCompare {
    public static boolean backspaceCompare(String s, String t) {
        return func(s).equals(func(t));
    }
    public static String func(String string ){
        StringBuilder sb = new StringBuilder();
        int n = string.length();
        for (int i = 0; i < n; i++) {
            char ch = string.charAt(i);
            if (ch!= '#'){
                sb.append(ch);
            }else{
                if (sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "a##c";
        String str2 = "#a#c";
        System.out.println(backspaceCompare(str1, str2));

    }
}
