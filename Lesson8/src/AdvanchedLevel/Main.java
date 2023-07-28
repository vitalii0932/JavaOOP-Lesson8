package AdvanchedLevel;

public class Main {
    public static void main(String[] args) {
        Object[] array = new Object[] {1, 2, 3};
        Stack stack = new Stack(array);
        System.out.println(stack.toString());
        stack.push(1);
        System.out.println(stack.toString());
        stack.push(11);
        System.out.println(stack.toString());

        Object pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack.toString());

        Object peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.toString());
    }
}