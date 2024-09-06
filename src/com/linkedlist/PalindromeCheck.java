package com.linkedlist;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	boolean isPalindrome(Node head) {
        // Your code here
        Node slow = head;
        Node fast= head;
        Node curr = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverse(slow.next);
        while(rev != null){
            if(rev.data != curr.data ){
                return false;
            }
            rev = rev.next;
            curr = curr.next;
        }
        return true;
        
    }
    static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
    }
}
