package com.linkList.No707DesignLinkedList;

/**
 * Remarks:
 * Author:panlai
 * :Date:2021/4/25
 */
class MyLinkedList {
    int size;
    ListNode head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */

        public int get(int index) {

        if (index<0 || index>=size){
            return -1;
        }
        ListNode cur = head;
        for (int i = 0; i <index+1 ; ++i) {
            cur = cur.next;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        if(head.next == null){
            head.next = node;
            size++;
            return;
        }
        node.next = head.next;
        head.next = node;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        if (head.next == null){
            head.next = node;
            size++;
            return;
        }
        ListNode cur = head.next;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        ListNode node = new ListNode(val);
        if(head.next == null){
            head.next = node;
            size++;
            return;
        }
        if (index<0 || index>size){
            System.out.println("index不合法！");
            return;
        }
        if (index == 0){
            addAtHead(val);
            return;
        }
        if (index == size){
            addAtTail(val);
            return;
        }
        ListNode cur = head.next;
        for (int i = 0; i < index-1; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        size++;

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index<0 || index >= size){
            System.out.println("index不合法！");
            return;
        }
        if (index == 0){
            head.next = head.next.next;
            size--;
        }
        else if(index == size-1){
            ListNode cur = head.next;
            while (cur.next.next!= null){
                cur = cur.next;
            }
            cur.next = null;
            size--;
        }else {
            ListNode cur = head.next;
            for (int i = 0; i < index-1; i++) {
                cur = cur.next;
            }
            if (cur.next != null){
                cur.next = cur.next.next;
                size++;
            }
        }
    }


    //自定义的display方法
    public void display(){
        ListNode cur = head.next;
        while (cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}