package com.linkedlist;

public class CircularDoublyLinkedlist {
	static Node head;
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int x){
			data = x;
		}
	}
	public static void main(String[] args) {
		int [] arr = {2, 5, 1, 8, 4, 6};
		//System.out.println("Now inserting at end");
		for(int i=0; i< arr.length; i++) {
			head = insertAtEnd(head, arr[i]);
		}
		print();
		head = insertAtBeginning(head, 9);
		head = insertAtBeginning(head, 7);
		print();
		System.out.println();
	}
	public static void print() {
		if(head == null) {
			return;
		}
		Node curr = head;
		while(curr.next != head) {
			System.out.print(curr.data + "->");
			curr= curr.next;
		}
		System.out.println(curr.data);
		System.out.println(curr.next.data);
	}
	
	public static Node insertAtEnd(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next= temp;
			temp.prev = temp;
			return temp;
		}
		Node curr = head;
		while(curr.next != head) {
			curr = curr.next;
		}
		temp.next= head;
		curr.next = temp;
		temp.prev = curr;
		head.prev =temp;
		return head;
	}
	public static Node insertAtBeginning(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next= temp;
			temp.prev= temp;
			return temp;
		}
		temp.next = head;
        temp.prev = head.prev;
        head.prev.next = temp;
        head.prev = temp;
        return temp;
		
	}
	
}