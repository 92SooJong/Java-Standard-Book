package com.soojong.study.algorithm;

import java.util.Stack;

class LeetCodeProblem20 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (stack.empty()) {
                stack.push(c);
                continue;
            }

            Character peek = stack.peek();
            if (peek == '(' && c == ')') {
                stack.pop();
                continue;
            } else if (peek == '[' && c == ']') {
                stack.pop();
                continue;
            } else if (peek == '{' && c == '}') {
                stack.pop();
                continue;
            }

            stack.push(c);
        }

        return stack.empty();
    }
}
