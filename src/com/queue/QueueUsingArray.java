package com.queue;

public class QueueUsingArray {

// time complexity of all operations is O(1)	
// elements are processed in FIFO order
// rear -> insertion occurs (enqueue)
// front -> removal of element (dequeue)
/*
 * Breadth First Search
 *  This property of Queue makes it also useful in following kind of scenarios:

When a resource is shared among multiple consumers. Examples include CPU scheduling, Disk Scheduling.
When data is transferred asynchronously (data not necessarily received at same rate as sent) between two processes. Examples include IO Buffers, pipes, file IO, etc.
 * */	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		System.out.println(q.front());
		System.out.println(q.size());
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		System.out.println(q.front());
		System.out.println(q.rear());
		System.out.println(q.size);
	}

}

class Queue{
	int front, rear, size;
	int capacity;
	int[] array;
	
	public Queue(int capacity){
		this.capacity = capacity;
		front = this.size=0;
		rear = capacity-1;
		array = new int[this.capacity];
	}
	// queue is full when size becomes equal to capacity
	boolean isFull(Queue queue) {
		return (queue.size == queue.capacity);
	}
	// queue is empty when size is 0
	boolean isEmpty(Queue queue) {
		return queue.size ==0;
	}
	// method to add an item to the queue
	
	void enqueue(int item) {
		if(isFull(this)){
			System.out.println("Queue is full");
			return;
		}
		rear = (rear+1)%capacity;
		array[rear]= item;
		size++;
	}
	
	int dequeue() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		int item = array[front];
		size--;
		front = (front+1)%capacity;
		return item;
	}
	
	int front() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		return array[front];
	}
	int rear() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		return array[rear];
	}
	int size() {
		return size;
	}
	
	
	
}













