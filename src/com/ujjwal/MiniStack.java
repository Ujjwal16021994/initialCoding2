package com.ujjwal;

public class MiniStack {
    public static void printLinkedList(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.x + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void addToEnd(int n,node head) {
        node rew = new node(n);
        if(head==null)
        {
            head = rew;
            return;
        }
        node temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = rew;
    }
    public static node addToFirst(int n,node head) {
        node ese = new node(n);
        if(head == null)
        {
            head = ese;
            return head;
        }

        ese.next = head;
        head = ese;
        return head;
    }
    public static void addToMidAfterA(int n,node head,int a) {
        node ds = new node(n);
        node tmp = head;
        while(tmp.x!=a && tmp!=null)
        {
            tmp = tmp.next;
        }
        if(tmp==null)
        {
            return;
        }
        node pmt = tmp.next;
        tmp.next = ds;
       ds.next = pmt;
    }
    public static void removeLast(node head) {
        if(head==null || head.next==null)
        {
            head = null;
            return;
        }
        node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
    }
    public static node removeHead(node head) {
        head = head.next;
        return head;
    }
    public static void removeMidElementAfterN(int n,node head) {
        node temp = head;
        while(temp.next.x != n )
        {
            temp = temp.next;
        }
        node temp1 = temp.next.next;
        temp.next = null;
        temp.next = temp1;
    }


    public static void main(String[] args) {
        node head = null;
        node ram = new node(10);
        head = ram;
        node lakshman = new node(5);
        ram.next = lakshman;
        System.out.println(ram);
        System.out.println(ram.x);
        System.out.println(ram.next);
        System.out.println(lakshman);
        System.out.println(lakshman.x);
        System.out.println(lakshman.next);
        node bharat = new node(2);
        lakshman.next = bharat;
        node satrudhan = new node(1);
        bharat.next = satrudhan;
        System.out.println("---------  ---------");
        printLinkedList(head);
        addToEnd(13,head);
        System.out.println("_____________________");
        printLinkedList(head);
        head = addToFirst(15,head);
        printLinkedList(head);
        System.out.println("_____________________");
        addToMidAfterA(3,head,5);
        printLinkedList(head);
        removeLast(head);
        printLinkedList(head);
        head = removeHead(head);
        printLinkedList(head);
        removeMidElementAfterN(3,head);
        head = removeHead(head);
        printLinkedList(head);
        addToMidAfterA(23,head,1);
        addToMidAfterA(33,head,23);
        addToMidAfterA(3,head,5);
        printLinkedList(head);
    }
}

class node {
    int x;
    node next;

    node(int n) {
        x = n;
        next = null;
    }
}