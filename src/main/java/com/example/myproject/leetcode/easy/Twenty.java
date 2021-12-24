package com.example.myproject.leetcode.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 有效的括号
 * 建议再看
 * 此题涉及到栈 用常规逻辑很难得到答案
 * 空值的处理方法之一 使用赋初值  增加 问号
 */
public class Twenty {
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        int num = 0;
        Map<Character, Character> value = new HashMap<>();
        value.put('(', ')');
        value.put('[', ']');
        value.put('{', '}');
        value.put('?','?');
        LinkedList<Character> stack = new LinkedList<Character>() {{
            add('?');
        }};
        for (Character character : s.toCharArray()) {
            if (value.containsKey(character)) {
                stack.add(character);
            } else if (value.get(stack.removeLast()) != character){
                return false;
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("){"));
    }
}