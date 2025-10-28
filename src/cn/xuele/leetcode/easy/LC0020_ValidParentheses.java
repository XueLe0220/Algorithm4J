package cn.xuele.leetcode.easy;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * @author XueLe
 * @since 2025-10-22
 */

public class LC0020_ValidParentheses {

    public boolean isValid(String s) {
        int n = s.length();
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '(') stack.push(')');
            else if(ch == '[') stack.push(']');
            else if(ch == '{') stack.push('}');
            else if (stack.isEmpty() || stack.peek() != ch) return false;
            else stack.pop();
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(()){{}}";
        System.out.println(new LC0020_ValidParentheses().isValid(s));
    }
}
