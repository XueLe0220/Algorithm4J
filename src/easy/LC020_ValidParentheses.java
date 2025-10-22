package easy;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LC020_ValidParentheses {

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
}
