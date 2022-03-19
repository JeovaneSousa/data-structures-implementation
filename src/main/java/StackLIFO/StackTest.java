package StackLIFO;

public class StackTest {
    public static void main(String[] args) {
        StackTry stack = new StackTry();

        stack.push("Jeovane");
        stack.push("Ada");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.isEmpty());
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
