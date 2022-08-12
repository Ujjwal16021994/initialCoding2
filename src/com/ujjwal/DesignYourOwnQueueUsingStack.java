package com.ujjwal;

import java.util.Stack;

public class DesignYourOwnQueueUsingStack {
    public static void main(String[] args) {

        QueueClass set = new QueueClass();
        set.add(5);
        System.out.println(set.size());
        set.add(56);
        set.add(568);
        System.out.println(set.size());
        System.out.println(set.peek());
        set.poll();
        System.out.println(set.peek());
        System.out.println(set.size());

    }
}

class QueueClass1 {
    Stack<Integer> stack = new Stack<>();
    void add(int n) {
        Stack<Integer> stack1 = new Stack<>();
        while (!stack.empty())
        {
            stack1.push(stack.pop());
        }
        stack.push(n);
        while (!stack1.empty())
        {
            stack.push(stack1.pop());
        }
    }
    boolean isEmpty() {
        if(stack.empty())
        {
            return true;
        }
        return false;
    }
    int size(){
        return stack.size();
    }
    int peek() {
        if(stack.empty())
        {
            System.out.println("stack is empty");
            return -1;
        }
        return stack.peek();
    }
    void poll(){
        if(stack.empty())
        {
            System.out.println("stack is empty");
            return;
        }
        stack.pop();
        return;
    }

}