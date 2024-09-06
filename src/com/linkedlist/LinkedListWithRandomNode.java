package com.linkedlist;

public class LinkedListWithRandomNode {

	static class Node{
		int data ;
		Node next;
		Node random;
		Node(int d){
			data= d;
			next = null;
			random = null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Node copyList(Node head) {
        // your code here
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = next;
            curr = next;
        }
        for(curr = head; curr != null; curr= curr.next.next){
            curr.next.random =curr.random != null ? curr.random.next: null;
        }
        Node h2 = head.next;
        Node clone = h2;
        for(curr =head; curr != null; curr= curr.next){
            curr.next = curr.next.next;
            clone.next = clone.next != null ?clone.next.next: null;
            clone = clone.next;
        }
        return h2;
    }

}
