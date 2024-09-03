package com.linkedlist;

import java.util.HashMap;

public class LRUCacheDesignClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache cache = new LRUCache(2);
		cache.set(1, 1);
		cache.set(2, 2);
		System.out.println(cache.get(2));

	}

}

class LRUCache {
    // Constructor for initializing the cache capacity with the given value.
    static class Node{
        int key;
        int data;
        Node next;
        Node prev;
        Node(int key, int val){
            this.key = key;
            this.data = val;
        }
    }
    private HashMap<Integer, Node> map;
    private int capacity, count;
    private static Node head,tail;
    LRUCache(int cap) {
        
        // code here
        this.capacity = cap;
        map = new HashMap<>();
       head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev= head;
        head.prev = null;
        tail.next = null;
        
    }

    // Function to return value corresponding to the key.
    public int get(int key) {
        // your code here
        if(map.get(key) != null){
            Node node = map.get(key);
            int result = node.data;
            deleteNode(node);
            addHead(node);
            return result;
            
        }
        return -1;
        
    }

    // Function for storing key-value pair.
    public void set(int key, int value) {
        // your code here
        if(map.get(key) != null){
            Node node = map.get(key);
            node.data = value;
            deleteNode(node);
            addHead(node);
            
        }else{
            Node node = new Node(key, value);
            map.put(key, node);
            if(count< capacity){
                count++;
                addHead(node);
            }else{
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
                addHead(node);
            }
        }
    }
    
    public static void deleteNode(Node node){
        node.prev.next = node.next;
            node.next.prev = node.prev;
    }
    public static void addHead(Node node){
        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;
    }
        
    
}
