package com.stack;

import java.util.Stack;

public class StackInJavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Stack is a legacy class that inherits from vector
		 * it is thread safe and involves overhead when we do not need thread safety
		 * recommended to use ArrayDeque for stack impl as it is more efficient in a single threaded environment
		 * */
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(5);
		stack.push(8);
		stack.push(13);
		stack.push(18);
		System.out.println("Stack top element is "+ stack.peek());
		System.out.println(stack.pop());
		System.out.println("Checking the deleted element 18 "+ stack.search(18));
		System.out.println("Stack top element is "+stack.peek());
		System.out.println("Element 5 is present at position "+stack.search(5));;
		

	}

}
