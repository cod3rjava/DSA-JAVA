package com.cod3rjava.linklist;

public class Main {


    public static void main(String[] args) {
        LinkedListTest linkedListTest = new LinkedListTest(4);

//        System.out.println(linkedListTest.getHead());
//        System.out.println(linkedListTest.getTail());
//        System.out.println(linkedListTest.getLength());

        linkedListTest.append(6);linkedListTest.append(3);linkedListTest.append(61);linkedListTest.append(45);
//        linkedListTest.remove();
//        linkedListTest.prepend(90);
//        linkedListTest.removeFirst();
//        linkedListTest.printList();

        System.out.println(linkedListTest.get(1).value);
    }





}