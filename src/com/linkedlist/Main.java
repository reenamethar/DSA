package com.linkedlist;

//{ Driver Code Starts
import java.util.*;


class Node {
  int data;
  Node next;

  Node(int x) {
      data = x;
      next = null;
  }
}

public class Main {
  public static void printList(Node node) {
      while (node != null) {
          System.out.print(node.data + " ");
          node = node.next;
      }
      System.out.println();
  }

  public static void addressStore(Node[] arr, Node head) {
      Node temp = head;
      int i = 0;
      while (temp != null) {
          arr[i] = temp;
          i++;
          temp = temp.next;
      }
      
  }

  public static boolean check(Node[] before, Node[] after, int num, int k) {
      if (k > num) return true;

      for (int i = 0; i < num; i++) {
          if ((i == k - 1) || (i == num - k)) {
              if (!((before[k - 1] == after[num - k]) &&
                    (before[num - k] == after[k - 1]))) {
                  return false;
              }
          } else {
              if (before[i] != after[i]) {
                  return false;
              }
          }
      }
      return true;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      sc.nextLine(); // Consume the newline

      while (t-- > 0) {
          List<Integer> arr = new ArrayList<>();
          String input = sc.nextLine();
          Scanner ss = new Scanner(input);

          // Read numbers from the input line
          while (ss.hasNextInt()) {
              arr.add(ss.nextInt());
          }

          int k = sc.nextInt();
          sc.nextLine(); // Consume the newline

          Node head = null;

          // Check if the array is empty
          if (!arr.isEmpty()) {
              head = new Node(arr.get(0));
              Node tail = head;
              for (int i = 1; i < arr.size(); ++i) {
                  tail.next = new Node(arr.get(i));
                  tail = tail.next;
              }
          }

          int num = arr.size();
          Node[] before = new Node[num];
          addressStore(before, head);
          printList(head);
          Solution ob = new Solution();
          head = ob.swapKthNode(head, k);

          Node[] after = new Node[num];
          addressStore(after, head);

          if (check(before, after, num, k))
              System.out.println("true");
          else
              System.out.println("false");
      }

      sc.close();
  }
}

//} Driver Code Ends


//User function Template for Java
class Solution {
  public Node swapKthNode(Node head, int k) {
  if (head == null || k <= 0) {
      return head; // Edge cases: empty list or invalid k
  }
  
  // Calculate the length of the linked list
  int count = 0;
  Node curr = head;
  while (curr != null) {
      count++;
      curr = curr.next;
  }
  
  // If k is greater than the length of the list or k is invalid, return the original head
  if (k > count ) {
      return head;
  }
  
  // Find the k-th node from the beginning and the end
  Node node1 = head;
  Node node1Prev = null;
  Node node2 = head;
  Node node2Prev = null;
  
  // Finding the k-th node from the start
  for (int i = 1; i < k; i++) {
      node1Prev = node1;
      node1 = node1.next;
  }
  
  // Finding the k-th node from the end (n-k+1-th from the start)
  for (int i = 1; i < count - k + 1; i++) {
      node2Prev = node2;
      node2 = node2.next;
  }
  
  // If both nodes are the same, no need to swap
  if (node1 == node2) {
      return head;
  }
  
  // Swap the nodes
  if (node1Prev != null) {
      node1Prev.next = node2;
  } else {
      head = node2; // Node1 is the head, update head to node2
  }
  
  if (node2Prev != null) {
      node2Prev.next = node1;
  } else {
      head = node1; // Node2 is the head, update head to node1
  }
  
  // Swap the next pointers of node1 and node2
  Node temp = node1.next;
  node1.next = node2.next;
  node2.next = temp;
  
  return head;
}

}
