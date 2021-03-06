package org.example;

public class LinkedList {
    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    /**
     * No constructor, so Java will create default no args constructor
     */

    // Track head
    private Node head;
    private int size;

    // O(1)
    public void addFront(int val) {
        Node newNode = new Node(val);

        // If head... set and return
        if (head == null ) {
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head  = newNode;
        size++;
    }

    // O(1)
    public int getFirst() {
        if(head ==null) {
            throw new IllegalStateException("Empty list!");
        }

        return head.val;
    }

    // O(n)
    public int getLast() {
        if(head ==null) {
            throw new IllegalStateException("Empty list!");
        }

        Node cursor = head;

        while(cursor.next != null) {
            cursor=cursor.next;
        }
        return cursor.val;
    }

    // O(n)
    public void addBack(int val) {
         // Create new Node
        Node newNode = new Node(val);

        // If head... set and return
        if (head == null ) {
            head = newNode;
            size++;
            return;
        }

        // Start at the head
        Node cursor = head;

        // Walk back node = null
        while(cursor.next != null) {
            cursor=cursor.next;
        }

        cursor.next = newNode;
        size++;
    }

    // O(1)
    public int size() {
        return size;
    }

    // O(1)
    public void clear() {
        head = null;
        size = 0;
    }

    // O(n)
    public void deleteValue(int val) {
        Node cursor = head.next;
        Node prevCursor = head;

        if(head == null) {
            return;
        }

        // Special condition where head points to target
        if(head.val == val) {
            head = head.next;
            size--;
            return;
        }

        while(cursor != null) {
            if(cursor.val == val) {
                prevCursor.next = cursor.next;
            }
            cursor = cursor.next;
            prevCursor = prevCursor.next;
        }
        size--;
    }
}
