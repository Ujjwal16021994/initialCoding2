package com.ujjwal;

public class newjava {
    public static void main(String[] args) {
        pair p1 = new pair(5,9);
        System.out.println(p1.x);
        System.out.println(p1.x);
        pair[] poo = new pair[3];
        poo[1] = new pair(5,3);
        poo[2] = new pair(6,9);

    }
}
class pair {
    int x;
    int y;

    pair(int n ,int m)
    {
        x = n;
        y = m;
    }
}

