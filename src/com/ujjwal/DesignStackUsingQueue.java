package com.ujjwal;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class DesignStackUsingQueue {
    public static void main(String[] args) {
        StackClass stack = new StackClass();
        System.out.println(stack.peek());
        stack.push(55);
        stack.push(7);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}

class StackClass{
    Queue<Integer> set = new LinkedList<>();
    Queue<Integer> set1 = new LinkedList<>();
    void push(int n) {
        while (set.size()!=0)
        {
            set1.add(set.poll());
        }
        set.add(n);
        while (set1.size()!=0)
        {
            set.add(set1.poll());
        }
    }
    int size () {
        return set.size();
    }
    boolean empty() {
        if(set.size()==0)
            return true;
        return false;
    }
    int peek () {
        if(set.size()==0)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return set.peek();
    }
    int pop() {
        if(set.size()==0)
        {
            System.out.print("Stack is empty");
            return -1;
        }
        return set.poll();
    }


}