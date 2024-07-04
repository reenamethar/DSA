package com.hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {
	// ways of handling collision
	// 1. chaining
	// 2. Open Addressing
// array of linkedlist
// when collision happens , insert the item at the end of the linkedlist	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class MyHash{
	int BUCKET;
	ArrayList<LinkedList<Integer>> table;
	MyHash(int b){
		BUCKET = b;
		table = new ArrayList<LinkedList<Integer>>();
		for(int i=0; i<b; i++) {
			// initialize array of linkedlist
			table.add(new LinkedList<Integer>());
		}
	}
	public void insert(int key) {
		
	}
}