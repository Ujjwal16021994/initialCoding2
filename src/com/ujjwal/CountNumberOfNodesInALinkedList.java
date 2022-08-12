package com.ujjwal;

public class CountNumberOfNodesInALinkedList {
    public static void addNode(int n,Node head) {
        Node adda = new Node(n);
        if(head == null)
        {
         head = adda;
         return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = adda;
    }
    public static void printList(Node head) {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        addNode(3,head);
        addNode(5,head);
        addNode(8,head);
        addNode(10,head);
        addNode(13,head);
        addNode(17,head);
        addNode(19,head);
        printList(head);

    }
}

class Node {
    int data;
    Node next;

    Node(int n)
    {
        data = n;
        next = null;
    }
    
}