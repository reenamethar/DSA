package com.tree;

import java.util.ArrayList;

public class SerializeDeserialize {
//Serialization is to store the tree in a file so that it can be later restored. The structure of the tree must be maintained. Deserialization is reading the tree back from a file.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void serialize(Node root, ArrayList<Integer> arr) {
		// preorder traversal
		//time theta(n) space theta(n)
		if(root == null) {
			arr.add(-1);
			return;
		}
		arr.add(root.data);
		serialize(root.left, arr);
		serialize(root.right, arr);
	}
	int index=0;
	Node deserialize(ArrayList<Integer> arr) {
		// same traversal we need to follow which we have used for serialization
		//time theta(n) space theta(n)
		if(index == arr.size()) {
			return null;
		}
		int val = arr.get(index);
		index++;
		if(val == -1) {
			return null;
		}
		Node node = new Node(val);
		node.left = deserialize(arr);
		node.right = deserialize(arr);
		return node;
	}

}
