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

    public Node removeLast() {
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

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
//        if (head == tail) { // you can follow this or
//            head = tail = null;
//        }
        Node firstNode = head;
        head = head.next;
        firstNode.next = null;
        length--;
        if (length == 0) { // or this approach for the edge cash where we have only one element in the list
            tail = null;
        }
        return firstNode;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node temp = head;

        // Follow the while loop or for loop
//        int count = 0;
//        while (count != index) {
//            temp = temp.next;
//            count++;
//        }

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node currentNode = new Node(value);
        Node temp = get(index - 1);
        currentNode.next = temp.next;
        temp.next = currentNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }
        Node prevNode = get(index - 1);
        Node temp = prevNode.next;
        prevNode.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public LinkedListTest(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }



    class Node {
         int value;
         Node next;

        Node(int value){
            this.value = value;
        }
    }
}