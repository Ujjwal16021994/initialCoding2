package com.ujjwal;
import java.util.ArrayList;

public class BuildYourOwnStack {

    public static void main(String[] args) {
        stactclass st = new stactclass();
        st.push(6);
        st.push(5);
        System.out.println(st.size());
        st.push(55);
        st.push(6554);
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.empty());
        st.pop();
        System.out.println(st.size());
    }
}

class stactclass{
    ArrayList<Integer> arr = new ArrayList<>();
    void push(int n) {
        arr.add(n);
    }
    int size() {
        if(arr.size()!=0)
        return arr.size();
        System.out.println("array is empty");
        return 0;
    }
    boolean empty() {
        if(arr.size()!=0)
        {
            System.out.println("stack is not empty");
            return false;
        }
        System.out.println("stack is empty");
        return true;
    }
    int peek() {
        if(arr.size()!=0)
        {
            System.out.println(arr.get(arr.size()-1));
            return arr.get(arr.size()-1);
        }
        System.out.println("stack is empty");
        return -1;
    }
    void pop() {
        if(arr.size()!=0)
        {
            int n= arr.size();
            arr.remove(n-1);
            return;
        }
        System.out.println("the stack is empty.. cant pop");
        return;
    }

}