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

//        System.out.println(linkedListTest.get(1).value);
//        linkedListTest.set(2, 64);
//        linkedListTest.insert(0, 99);
//        linkedListTest.insert(3, 29);
//        linkedListTest.remove(4);
        linkedListTest.printList();
        linkedListTest.reverse();
        linkedListTest.printList();
    }





}