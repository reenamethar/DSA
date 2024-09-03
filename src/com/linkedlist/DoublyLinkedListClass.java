package com.linkedlist;

import com.linkedlist.LinkedlistClass.Node;

public class DoublyLinkedListClass {
	static Node head;
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int x){
			data = x;
			prev =null;
			next= null;	
		}
	}
	static void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+ " ");
			n = n.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * head = new Node(10); Node temp1 = new Node(20); Node temp2 = new Node(30);
		 * head.next = temp1; temp1.prev= head; temp1.next = temp2; temp2.prev = temp1;
		 */
		int [] arr = {1, 3, 10, 5, 20, 18};
		 insert(arr);
		printList();
		head = insertAtBeginning(head, 15);
		head = insertAtBeginning(head, 17);
		printList();
		head = insertAtEnd(head, 25);
		head = insertAtEnd(head, 30);
		printList();
		Node node = head;
		while(node != null && node.data != 17) {
			node = node.next;
		}
		head = insertAfterNode(node, 4);
		printList();
		head = insertBeforeNode(node, 2);
		printList();
		//System.out.println("after reversing");
		//head = reverse(head);
		head = deleteHeadNode(head);
		printList();
		head = deleteLastNode(head);
		printList();
		head= deletAtPosition(head, 3);
		printList();
		head= deletAtPosition(head, 9);
		printList();
		
	}
	
	public static void insert(int[] arr) {
		head = new Node(arr[0]);
		Node prevNode = head;
		Node curr = head;
		for(int i=1; i< arr.length; i++) {
			curr.next = new Node(arr[i]);
			curr.prev = prevNode;
			prevNode = curr;
			curr = curr.next;
		}
	}
	public static Node  insertAtBeginning(Node head, int x) {
		Node temp = new Node(x);
		if(head != null) {
			head.prev = temp;
			temp.next = head;		
		}
		return temp;
	}
	public static Node insertAtEnd(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) {
			return temp;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.prev = curr;
		return head;
	}
	
	public static Node insertAfterNode(Node prevNode, int x) {
		Node newNode = new Node(x);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		newNode.prev = prevNode;
		if(newNode.next != null) {
			newNode.next.prev = newNode;
		}
		return head;
		
	}
	
	public static Node insertBeforeNode(Node nextNode, int x) {
		Node newNode = new Node(x);
		newNode.prev = nextNode.prev;
		nextNode.prev = newNode;
		newNode.next = nextNode;
		if(newNode.prev != null) {
			newNode.prev.next = newNode;
		}else {
			head = newNode;
		}
		return head;
	}
	public static Node reverse(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node prev = null;
		Node curr = head;	
		while(curr != null) {
			Node next = curr.next;
			curr.next = prev;
			curr.prev= next;
			prev = curr;
			curr= next;
			
		}
		return prev;
		
	}
	public static Node deleteHeadNode(Node head) {
		if(head == null ) {
			return head;
		}else {
			return head.next;
		}
	}
	public static Node deleteLastNode(Node head) {
		if(head == null || head.next == null) {
			return null;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.prev.next = null;
		return head;
	}
	public static Node deletAtPosition(Node head, int pos) {
		if(head == null) {
			return null;
		}
		if(pos ==1) {
			return head.next;
		}
		Node curr = head;
		int i=1;
		while(i !=pos && curr != null) {
			i++;
			curr = curr.next;
		}
		if(curr == null) {
			return head;
		}
		if(curr.next == null) {
			curr.prev.next = null;
			return head;
		}
		curr.prev.next = curr.next;
		curr.next.prev = curr.prev;
		return head;
		
	}

}
