package com.ujjwal;

import java.util.ArrayList;

public class DesignOwnQueueUsingArrayList {
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

class QueueClass{

    ArrayList<Integer> list = new ArrayList<>();
    int peek() {
        int n = list.size();
        if(n==0)
        {
            System.out.println("queue is empty");
            return -1;
        }
        return list.get(0);
    }
    void add (int n) {
        list.add(n);

    }
    void poll() {
        int n = list.size();
        if(n==0)
        {
            System.out.println("queue is empty");
            return;
        }
        list.remove(0);
        return;
    }
    boolean isEmpty() {
        int n = list.size();
        if(n==0)
            return true;
        return false;
    }
    int size() {
        int n = list.size();
        return n;
    }
}