package com.tree;

public class ContrustTree2 {
	//construct a binary tree from postorder and inorder traversal
	int postIndex;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Node4 buildTree(int[] inorder, int[] postorder) {
        // code here
        postIndex = postorder.length-1;
        Node4 root = cTree(inorder,postorder,0,inorder.length-1);
        return root;
    }
    
     
    public  Node4 cTree(int[] in, int[] post, int is, int ie){
        if(is>ie){
            return null;
        }
        Node4 root = new Node4(post[postIndex--]);
        int index =0;
        for(int i=is; i<=ie; i++){
            if(in[i] == root.data){
                index = i;
                break;
            }
        }
        root.right = cTree(in, post, index+1, ie);
        root.left = cTree(in, post, is, index-1);
        return root;
    }

}

class Node4{
	Node4 left;
	Node4 right;
	int data;
	Node4(int x){
		this.data = x;
	}
	
}
