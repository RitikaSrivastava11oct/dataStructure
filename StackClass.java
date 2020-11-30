/*
Java Collection framework provides a Stack class that models and implements a Stack data structure. 
The class is based on the basic principle of last-in-first-out. 
In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek.


How to Create a Stack?
In order to create a stack, we must import java.util.stack package and use the Stack() constructor of this class. The below example creates an empty Stack.

Stack<E> stack = new Stack<E>();

Here E is the type of Object.*/

// Java code for stack implementation 

import java.io.*; 
import java.util.*; 

class Test 
{ 
	// Pushing element on the top of the stack 
	static void stack_push(Stack<Integer> stack) 
	{ 
		for(int i = 0; i < 5; i++) 
		{ 
			stack.push(i); 
		} 
	} 
	
	// Popping element from the top of the stack 
	static void stack_pop(Stack<Integer> stack) 
	{ 
		System.out.println("Pop Operation:"); 

		for(int i = 0; i < 5; i++) 
		{ 
			Integer y = (Integer) stack.pop(); 
			System.out.println(y); 
		} 
	} 

	// Displaying element on the top of the stack 
	static void stack_peek(Stack<Integer> stack) 
	{ 
		Integer element = (Integer) stack.peek(); 
		System.out.println("Element on stack top: " + element); 
	} 
	
	// Searching element in the stack 
	static void stack_search(Stack<Integer> stack, int element) 
	{ 
		Integer pos = (Integer) stack.search(element); 

		if(pos == -1) 
			System.out.println("Element not found"); 
		else
			System.out.println("Element is found at position: " + pos); 
	} 


	public static void main (String[] args) 
	{ 
		Stack<Integer> stack = new Stack<Integer>(); 

		stack_push(stack); 
		stack_pop(stack); 
		stack_push(stack); 
		stack_peek(stack); 
		stack_search(stack, 2); 
		stack_search(stack, 6); 
	} 
} 
