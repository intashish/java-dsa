package com.dsa.linkedlist;

public class FindMiddleNode {
}
class LinkedList {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public Node slowPointer = null;
    public Node fastPointer = null;
    public Node findMiddleNode(){
        if(head == tail) return head;
        slowPointer = head;
        fastPointer = head;
        while (fastPointer.next != null){
            slowPointer = slowPointer.next;
            //if odd length
            if(fastPointer.next != null && fastPointer.next.next != null){
                fastPointer = fastPointer.next.next;
            }else if(fastPointer.next != null){
                break;
            }
        }
        
        return  null;
    }
}

