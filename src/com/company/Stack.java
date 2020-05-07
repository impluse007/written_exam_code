package com.company;

public class Stack {
    int Maxsize;
    int size;
    char[] stack;
    public Stack(int size){
        stack=new char[size];
        size=0;
    }
    public void push(char val){
        stack[size++]=val;
    }
    public char peek(){
        return stack[size];
    }
    public char pop(){
        return stack[size--];
    }
    public boolean isFull(){
        return size==Maxsize-1;
    }
    public boolean isEmpty(){
        return size==0;
    }

}
