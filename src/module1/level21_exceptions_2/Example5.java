package module1.level21_exceptions_2;

import java.util.Stack;

public class Example5 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Last IN first OUT

        System.out.println(stack);
        System.out.println("В стеке: " + stack.size());

        System.out.println(stack.pop());
        System.out.println("В стеке: " + stack.size());

        System.out.println(stack.peek());
        System.out.println("В стеке: " + stack.size());

        System.out.println(stack.empty());

        System.out.println("-".repeat(100));
        System.out.println(stack.pop() + " : " + stack.size());
        System.out.println(stack.pop() + " : " + stack.size());
        System.out.println(stack.pop() + " : " + stack.size());
        // ВЫТАЩИТЬ ЧТО-ТО ЕЩЕ
        System.out.println(stack.pop() + " : " + stack.size());

    }
}
