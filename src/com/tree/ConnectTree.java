package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeC root = new NodeC(1);
		root.left = new NodeC(2);
		root.right = new NodeC(3);
		root.left.left = new NodeC(4);
		root.left.right = new NodeC(5);
		root.right.left = new NodeC(6);
		root.right.right = new NodeC(7);
		root = connect(root);
		printNextRight(root);
	}
	public static NodeC connect(NodeC root) {
        // Your code goes here.
       if(root == null){
           return null;
       }
       Queue<NodeC> queue = new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()){
           int size = queue.size();
           NodeC prev = null;
           for(int i=0; i<size; i++){
               NodeC curr = queue.poll();
               if(prev != null){
                   prev.nextRight = curr;
               }
               prev = curr;
               if(curr.left != null){
                   queue.add(curr.left);
               }
               if(curr.right != null){
                   queue.add(curr.right);
               }
           }
           prev.nextRight = null;
           
       }
       return root;
    }
	
	public static void printNextRight(NodeC root) {
		NodeC temp = root;
		while(temp != null) {
			NodeC levelStart = temp;
			while(levelStart != null) {
				//System.out.println("data "+ levelStart.data);
				System.out.print(levelStart.data + " -> ");
				
				levelStart=levelStart.nextRight; 
			}
			System.out.println("null");
			temp = temp.left;
		}
		
		
	}

}

class NodeC{
	NodeC left;
	NodeC right;
	NodeC nextRight;
	int data;
	NodeC(int data){
		this.data = data;
		left = null;
		right = null;
		nextRight = null;
	}
}
