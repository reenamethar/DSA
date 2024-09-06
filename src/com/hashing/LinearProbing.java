package com.hashing;

public class LinearProbing {
// Linear probing is a collision-handling technique in hashing. Linear probing says that whenever a collision occurs, search for the immediate next position.	
	
	/*
	 * Given an array of integers and a hash table size. Fill the array elements into a hash table using Linear Probing to handle collisions. Duplicate elements must be mapped to the same position in the hash table while colliding elements must be mapped to the [(value+1)%hashSize] position.

Note :-  If there's no more space to insert a new element, just drop that element. */

	//Ways to avoid collision in Open Addressing(all elements stored in the hash table itself,  no use of linkedlist as in case of separate chaining)
		// 1. linear probing
		// 2. quadratic probing
		// 3. double hashing
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[] = {4,14,24,44};
		int [] out = linearProbing(10, Array, 4);
		displayArray(out);
		

	}
	static int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        int output[] = new int[hash_size];
        for(int i=0; i<hash_size; i++){
            output[i] = -1;
        }
        for(int i=0; i<sizeOfArray; i++){
        	int value=arr[i];
        	int hashIndex = arr[i]% hash_size;
        	int originalIndex = hashIndex;
        	while(output[hashIndex] !=-1 && output[hashIndex] != value) {
        		// if its not negative then it means this space ia already occupied , and now we look for some other empty space
        		// 2nd condition checks for duplicate values
        		hashIndex = (hashIndex + 1)% hash_size;
        		if(hashIndex == originalIndex) {
        			// no space to insert value
        			break;
        		}
        	}
        	if(output[hashIndex]==-1 || output[hashIndex]== value) {
        		output[hashIndex]= arr[i];
        	}
        	
        }
        return output;
    }
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
