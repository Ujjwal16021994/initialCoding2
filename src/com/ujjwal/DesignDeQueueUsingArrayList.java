package com.ujjwal;

import java.util.ArrayList;

public class DesignDeQueueUsingArrayList {
    public static void main(String[] args) {

        deQueueClass de = new deQueueClass();
        de.addfirst(5);
        de.addlast(5);
        de.addfirst(57);
        de.addlast(54);
        de.addfirst(532);
        de.addlast(534);
        de.addfirst(5734);
        de.addlast(5425);
        System.out.println(de.empty());
        System.out.println(de.peeklast());
        System.out.println();
    }
}

class deQueueClass{
    ArrayList<Integer> list = new ArrayList<>();
    void addfirst(int n) {
       list.add(0,n);
    }
    void addlast(int n) {

        list.add(n);
    }
    int size() {
        return list.size();
    }
    int pollfirst() {
        if(list.size()==0)
            return -1;
        int r = list.get(0);
        list.remove(0);
        return r;
    }
    int polllast() {
        if (list.size()==0)
            return -1;
        int r =list.get(list.size()-1);
        list.remove(list.size()-1);
        return r;
    }
    int peekfirst() {
        if(list.size()==0)
        {
            System.out.println("Deque is empty");
            return -1;
        }
        return list.get(0);
    }
    int peeklast() {
        if(list.size()==0)
        {
            System.out.println("Deque is empty");
            return -1;
        }
        return list.get(list.size()-1);
    }
    boolean empty() {
        if(list.size()==0)
            return true;
        return false;
    }
}