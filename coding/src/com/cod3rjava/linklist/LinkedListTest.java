package com.cod3rjava.linklist;

public class LinkedListTest {

    private Node head;
    private Node tail;
    private int length;

    public int getHead() {
        if (head == null) {
            System.out.println("Head: null");
            return 0;
        }
        return this.head.value;
    }

    public int getTail() {
        if (head == null) {
            System.out.println("Tail: null");
            return 0;
        }
        return this.tail.value;
    }

    public int getLength() {
        return this.length;
    }

    public void printList() {
        Node temp = head;
//        if(head == tail){
//            System.out.println(head.value);
//            return;
//        }
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void removeOtherApproch() {
        if (length == 0) {
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
        }
        length--;
    }

    public Node remove() {
        if (length == 0) {
            return null;
        }
        if (head == tail) {
            head = tail = null;
        }
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = tail = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public LinkedListTest(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }



    class Node {
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
    }
}