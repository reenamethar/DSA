package com.linkedlist;

import java.util.*;
/*
 * XOR Linked Lists are Memory Efficient implementation of Doubly Linked Lists.
 *  An ordinary Doubly Linked List requires space for two address fields to store the addresses of previous and next nodes.
 *   A memory-efficient version of Doubly Linked List can be created using only one space for the address field with every node.
 *   This memory efficient Doubly Linked List is called XOR Linked List or Memory Efficient Linked List as the list uses bitwise XOR operation to save space for one address.
 *   In the XOR linked list instead of storing actual memory addresses every node stores the XOR of addresses of previous and next nodes.
 *   address variable in XOR representation as npx (XOR of next and previous)
 * */


public class XorLinkedList {
	static class Node {
	    int data;
	    Node npx; // XOR of next and previous node

	    Node(int val) {
	        this.data = val;
	        this.npx = null;
	    }
	}
	Node head;
    Node curr;


    // Function for insertion into Linked List
    public void insert(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            curr = newNode;
        } else {
            // XOR of current node's npx and new node's address
            curr.npx = xor(curr.npx, newNode);
            newNode.npx = curr;
            curr = newNode;
        }
    }

    // Function to print the linked list
    public void print() {
        Node temp = head;
        Node prev = null;
        Node next;

        while (temp != null) {
            System.out.print(temp.data + " ");
            next = xor(prev, temp.npx);
            prev = temp;
            temp = next;
        }
    }

    // Utility function to XOR two nodes
    private Node xor(Node a, Node b) {
        return new Node((a == null ? 0 : a.hashCode()) ^ (b == null ? 0 : b.hashCode()));
    }

    public static void main(String[] args) {
        XorLinkedList list = new XorLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.print(); // Print the linked list
    }
}
