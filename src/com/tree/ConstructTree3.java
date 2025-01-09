package com.tree;

public class ConstructTree3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Node createTree(int parent[]) {
        // Your code here
        int n = parent.length;
         Node root= null;
        Node [] nodes = new Node[n];
        for(int i=0; i<n; i++){
            nodes[i] =new Node(i);
        }
        for(int i=0; i<n; i++){
            if(parent[i]== -1){
                root = nodes[i];
            }
           else{
            Node parentNode =  nodes[parent[i]];
           if(parentNode.left == null){
               parentNode.left = nodes[i];
           }
           else{
               parentNode.right = nodes[i];
           }
           }
        }
        return root;    
        
        
    }

}
