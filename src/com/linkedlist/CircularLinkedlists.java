package com.linkedlist;

public class CircularLinkedlists {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int x){
			data = x;
			next = null;
		}
	}
	public static void main(String[] args) {
		int [] arr = {3, 5, 7, 8, 10, 15};
		for(int i=0; i< arr.length; i++) {
			 head =insertAtEnd(head, arr[i]);
		}
		printlist();
		head = insertAtBeginning(head, 9);
		printlist();
		//head = deleteHead(head);
		//printlist();
		//head = deleteHead(head);
		head = deleteKthNode(head, 5);
		printlist();
		head = deleteKthNode(head, 8);
		printlist();		
	} 
	public static Node insertAtEnd(Node head, int x) {
		Node newNode = new Node(x);
		if(head == null) {
			newNode.next = newNode;
			return newNode;
		}
		Node curr = head;
		while(curr.next != head) {
			curr = curr.next;
		}
		newNode.next= head;
		curr.next = newNode;
		return head;
	}
	
	
	public static void printlist() {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		for(Node ref = head.next; ref != head; ref= ref.next) {
			System.out.print(ref.data + " ");
		}
		System.out.println();
	}
	
	public static Node insertAtBeginning(Node head, int x) {
		Node newNode = new Node(x);
		if(head == null) {
			newNode.next = newNode;
			
		}
		else {
			Node curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			curr.next = newNode;
			newNode.next = head;
		}
		return newNode;
		
		
	}
	public static Node deleteHead(Node head) {
		if(head == null || head.next == head) {
			return null;
		}
		Node curr = head;
		while(curr.next != head) {
			curr = curr.next;
		}
		curr.next = head.next;
		return curr.next; // head.next
		
	}
	
	public static Node deleteKthNode(Node head, int k) {
		if(head == null) {
			return head;
		}
		if(k==1) {
			return deleteHead(head);
		}
		Node curr = head;
		for(int i=0; i<k-2; i++) {
			curr = curr.next;
		}
		curr.next= curr.next.next;
		return head;
		
	}
	
}
