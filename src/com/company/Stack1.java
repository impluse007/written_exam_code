package com.company;
import java.util.LinkedList;
public class Stack1 {
    private LinkedList<Character> stack;
    public Stack1(){
        stack=new LinkedList<>();
    }
    public void push(char s){
        stack.addFirst(s);
    }
    public char peek(){
        return stack.peekFirst();
    }
    public char pop(){
        return stack.pollFirst();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
