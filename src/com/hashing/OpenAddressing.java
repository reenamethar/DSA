package com.hashing;

public class OpenAddressing {
	// ways of handling collision
		// 1. chaining
		// 2. Open Addressing
	// time ->O(cap of hash of table) for each operation
	// space -> O(cap of hash of table)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{21,10,32,43};
		// output should be 10 -1 -1 32 -1 -1 -1 -1 43 -1 21
		MyHashClass hashClass = new MyHashClass(11);
		System.out.println(hashClass.search(2));
		System.out.println(hashClass.insert(21));
		System.out.println(hashClass.insert(10));
		System.out.println(hashClass.insert(32));
		System.out.println(hashClass.insert(43));
		System.out.println(hashClass.insert(45));
		System.out.println("already inserted so got "+ hashClass.insert(45)); // already inserted
		
		displayArray(hashClass.hash);
		System.out.println(hashClass.delete(45));
		displayArray(hashClass.hash);
		System.out.println("already deleted so got "+hashClass.delete(45)); // already deleted
		System.out.println(hashClass.insert(45));
		displayArray(hashClass.hash);

	}
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
class MyHashClass{
	int cap, size;
	int hash[];
	MyHashClass(int c){
		cap = c;
		size =0;
		hash= new int[cap];
		for(int i=0; i<cap; i++) {
			hash[i]=-1;
		}
	}
	int hash(int key) {
		return key %cap;
	}
	boolean search(int key) {
		int h = hash(key);
		int i=h;
		while(hash[i] != -1) {
			if(hash[i]== key) {
				return true;  // found key!!
			}
			i = (i+1)% cap;
			if(i == h) {
				return false; // hashtable is full -> we traversed the whole hash table
			}
		}
		
		return false; // return false if we find empty slot
	}
	boolean insert(int key) {
		if(size == cap) {
			return false; // hash table is already full
		}
		int i = hash(key);
		while(hash[i] != -1 && hash[i] != -2 && hash[i] != key) {
			i =(i+1)%cap; // probe until we find empty slot or deleted slot or hash duplicate value
		}
		if(hash[i] == key) {
			return false; //  key is already present, and we can't insert it so return false;
		}else {
			hash[i] = key; // gotthe empty slot or deleted slot , so  insert
			size++;
			return true;
		}
	}
	boolean delete(int key) {
		int h = hash(key);
		int i=h;
		while(hash[i] != -1) {
			if(hash[i] == key) {
				hash[i]= -2;
				return true;
			}
			i= (i+1)%cap;
			if(i==h) {
				return false;
			}
			
		}
		return false;
	}
}
