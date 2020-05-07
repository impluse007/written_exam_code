package com.company;
import java.util.Stack;

public class StackSort {
    public static Stack stacksort(Stack<Integer> s1){
        Stack<Integer> temp=new Stack<>();
        while(!s1.isEmpty()){
            int top=s1.pop();
            if(temp.isEmpty()||temp.peek()>=top)
                temp.push(top);
            else{
                while(!temp.isEmpty()&&top>temp.peek())
                    s1.push(temp.pop());
                temp.push(top);
            }
            }
        return temp;
        }

    public static void main(String[] args){
        Stack<Integer> s1=new Stack<>();
        s1.push(1);
        s1.push(4);
        s1.push(2);
        s1.push(15);
        s1.push(2);
        s1.push(8);
        Stack<Integer> res=stacksort(s1);
        while(!res.isEmpty()){
            System.out.println(res.pop());
        }


    }
}
