package Simples;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Character> ch = new Stack<>();
        String s = "abcde";
        for (char c:s.toCharArray()) {
            System.out.println(c);

        }
    }
}
