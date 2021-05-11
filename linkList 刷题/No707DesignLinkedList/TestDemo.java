package com.linkList.No707DesignLinkedList;

/**
 * Remarks:
 * Author:panlai
 * :Date:2021/4/25
 */


public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.display();
        myLinkedList.addAtHead(2);
        myLinkedList.display();
        myLinkedList.addAtTail(3);
        myLinkedList.display();
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        myLinkedList.addAtIndex(2,5);
        myLinkedList.display();

        myLinkedList.deleteAtIndex(3);
        myLinkedList.display();
        System.out.println(myLinkedList.get(0));
    }
}
