package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInbuiltClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(5);
		queue.add(10);
		queue.add(15);
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
		System.out.println(queue.size());
		System.out.println(queue.contains(15));
		System.out.println(queue.contains(20));
	}
	

}
