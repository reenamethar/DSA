package com.linkedlist;


public class LinkedlistClass {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int x){
			data = x;
			next = null;
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
		
		int [] arr = {1, 3, 3, 4, 5, 10, 10,  18};
		insert(arr);
		printList();
		//int x = 1;
		//System.out.println(x+ " is present at position "+ search(x));
		//System.out.println(x+ " is present at position "+ searchRecursive(head, x));
		//head =reverse(head);
		head = sortedInsert(head, 0);
		printList();
		//middleNaiveSoln(head);
		middleEfficientSoln(head);
		printNthNodeFromEnd(head, 3 );
		head = removeDuplicates(head);
		printList();
		//head = reverseInGroupsRec(head, 3);
		//head = reverseInGroupIterative(head, 3);
		head = seggregateEvenOdd(head);
		printList();
	}
	
	public static void insert(int [] arr) {
		head = new Node(arr[0]);
		Node curr = head;
		for(int i=1; i<arr.length; i++) {
			curr.next = new Node(arr[i]);
			curr= curr.next;
		}
		
	}
	public static int search(int x ) {
		int pos =1;
		Node curr = head;
		while(curr != null) {
			if(curr.data == x) {
				return pos;
			}
			else {
				pos++;
				curr = curr.next;
			}
		}
		
		return -1;
	}
	public static int searchRecursive(Node head, int x) {
		if(head == null) {
			return -1;
		}
		if(head.data == x) {
			return 1;
		}
		else {
			int res = searchRecursive(head.next, x);
			if(res == -1) {
				return -1;
			}else {
				return res+1;
			}
		}
	}
	public static Node reverse(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node curr = head;
		Node prev = null;
		while(curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr= next;
		}
		return prev;
		
	}
	public static Node sortedInsert(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) {
			return temp;
		}
		Node curr = head;
		if(x <head.data) {
			temp.next = head;
			return temp;
		}
		while(curr.next != null && curr.next.data <  x) {
			curr = curr.next;
		}
		
		temp.next = curr.next;
		curr.next = temp;
		
		return head;
	}
	
	public static void middleNaiveSoln(Node head) {
		if(head == null) {
			return;
		}
		Node curr = head;
		int count=0;
		while(curr != null) {
			curr = curr.next;
			count++;
		}  
		int mid = count/2;
		curr= head;
		for(int i=0; i<mid; i++) {
			curr = curr.next;
		}
		System.out.println("Middle element is "+ curr.data);
	}
	
	public static void middleEfficientSoln(Node head) {
		if(head == null) {
			return;
		}
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow  = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle Node is "+ slow.data);
	}
	public static void printNthNodeFromEnd(Node head, int n) {
		if(head == null) {
			return;
		}
		Node first =head;
		Node second = head;
		for(int i=0; i<n; i++) {
			if(first == null) {
				System.out.println("Invalid input");
				return;
			}
			first = first.next;
		}
		
		while(first != null) {
			second = second.next;
			first = first.next;
		}
		System.out.println(n+" node from end is "+ second.data);
		
	}
	
	public static Node recRev(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node rest_head = recRev(head.next);
		Node rest_tail = head.next;
		rest_tail.next = head;
		head.next = null;
		return rest_head;
		
	}
	
	public static Node removeDuplicates(Node head) {
		Node curr = head;
		while(curr != null && curr.next != null) {
			if(curr.data == curr.next.data) {
				curr.next = curr.next.next;
			}else {
				curr = curr.next;
			}
		}
		return head;
	}
	
	public static Node reverseInGroupsRec(Node head, int k) {
		Node curr = head;
		Node next = null;
		Node prev = null;
		int count =0;
		while(curr != null && count <k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if(next != null) {
			Node head_rest = reverseInGroupsRec(next, k);
			head.next = head_rest;
		}
		return prev;
	}
	
	public static Node reverseInGroupIterative(Node head, int k) {
		
		Node curr = head;
		Node prevFirst = null;
		boolean isFirstPass =true;
		while(curr != null) {
			Node first = curr;
			Node prev= null;
			int count =0;
			while(curr != null && count<k) {
				Node next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
				count++;
			}
			if(isFirstPass) {
				head = prev;
				isFirstPass = false;
			}else {
				prevFirst.next = prev;
			}
				prevFirst = first;
			
			
		}
		
		return head;
	}
	public static Node seggregateEvenOdd(Node head) {
		Node es=null, ee=null, os=null, oe= null;
		for(Node curr = head; curr != null; curr=curr.next) {
			int x = curr.data;
			if(x%2 == 0) {
				if(es == null) {
					es=ee= curr;	
				}else {
					ee.next = curr;
					ee = ee.next;
				}
			}
			else {
				if(os == null) {
					os=oe= curr;
				}else {
					oe.next =curr;
					oe= oe.next;
				}
			}
		}
		if(os== null || es==null) {
			return head;
		}
		
		ee.next = os;
		oe.next = null;
		return es;
	}
	
	public static int getIntersectionNodeData(Node head1, Node head2) {
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		if(c1>c2) {
			int d = c1-c2;
			return intersectionHelper(d, head1, head2);
		}else {
			int d = c2-c1;
			return intersectionHelper(d, head2, head1);
		}
		
	}
	public static int getCount(Node node) {
		Node curr = node;
		int count =0;
		while(curr != null) {
			count++;
		}
		return count;
	}
	public static int intersectionHelper(int d, Node head1, Node head2) {
		Node curr1 = head1;
		Node curr2 = head2;
		for(int i=0; i<d; i++) {
			if(curr1 == null) {
				return -1;
			}
			curr1 = curr1.next;
		}
		while(curr1 != null && curr2 != null) {
			if(curr1.data == curr2.data) {
				return curr1.data;
			}
			curr1 = curr1.next;
			curr2=  curr2.next;
		}
		return -1;
	}
	public static Node pairwise_swap(Node node)
    {
        // your code here
        if(node == null || node.next == null){
            return node;
        }
        Node curr = node.next.next;
        Node prev= node;
        node = node.next;
        node.next = prev;
        while(curr != null && curr.next != null){
            prev.next = curr.next;
            prev = curr;
            Node next = curr.next.next;
            curr.next.next = curr;
            curr = next;
        }
        prev.next = curr;
        return node;
    }
}
