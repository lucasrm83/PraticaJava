package Simples;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Character> ch = new Stack<>();
        String s = "abcdef";
        for (char c:s.toCharArray()) {
            ch.push(c);


        }
        System.out.println("ch contem: "+ch);
        System.out.println("O pico de ch é: "+ch.peek());
        System.out.println("ch é vazio?: "+ch.isEmpty());
        //Deleta o pico do stack
        //ch.pop();



    }
}
