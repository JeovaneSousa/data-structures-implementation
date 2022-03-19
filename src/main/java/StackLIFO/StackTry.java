package StackLIFO;

import java.util.LinkedList;

public class StackTry {
    private LinkedList<String> stack = new LinkedList<>();

    public void push(String name){
        stack.add(name);
    }

    public void pop(){
        stack.remove(stack.size() -1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
