package com.linkedlist;

public class MergeTwoSortedLinkedlistClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static Node sortedLLMerge(Node head1, Node head2) {
        //Time Complexity: O(N + M), where N and M are the size of list1 and list2 respectively
		//Auxiliary Space: O(1)
        Node head;
        Node tail;
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        if(head1.data <= head2.data){
            head = tail =head1;
            head1 = head1.next;
        }else{
            head = tail = head2;
            head2 = head2.next;
        }
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                tail.next =head1;
                tail = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                tail = head2;
                head2=  head2.next;
            }
        }
        if(head1 == null){
            tail.next = head2;
        }else{
            tail.next = head1;
        }
        return head;
    }
}
