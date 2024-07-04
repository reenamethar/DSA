package com.hashing;

public class QuadraticProbing {

	//Ways to avoid collision in Open Addressing(all elements stored in the hash table itself,  no use of linkedlist as in case of separate chaining)
	// 1. linear probing
	// 2. quadratic probing
	// 3. double hashing
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] ={21,10,32,43};
		int hash_size = 11;
		int [] hash = new int[hash_size];
		int N=4;
		quadraticProbing(hash, hash_size, arr, N);
		displayArray(hash);
	}
	public static void quadraticProbing(int[] hash, int hash_size, int arr[], int N) {
		for(int i=0; i< hash_size; i++) {
			hash[i]= -1;
		}
		for(int i=0; i<N; i++) {
			int element = arr[i];
			int hashValue = element % hash_size;
			int index = hashValue;
			int probe=1;
			// Quadratic probing to find the next available position
			while(hash[index] != -1 && hash[index] != element) {
				index = (hashValue + probe*probe) % hash_size;
				probe++;
				// If we have probed all positions, break to avoid infinite loop
				if(probe>hash_size) {
					break;
				}
			}
			// Insert the element into the calculated position if it's still vacant
			if(hash[index] == -1) {
				hash[index] = element;
			}	
		}
	}
	
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
