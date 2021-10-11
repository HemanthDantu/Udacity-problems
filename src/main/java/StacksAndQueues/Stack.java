package StacksAndQueues;

import java.util.ArrayList;

public class Stack<T> {

	int top = -1;
	ArrayList<T> s;
	int size;

	public Stack(int size) {
		this.size = size;
		this.s = new ArrayList<T>(size);
	}

	public void push(T val) {
		if (top + 1 > size) {
			top = top + 1;
			if (s.size() > top) {
				s.set(top, val);
			} else
				s.add(val);
		} else {
			System.out.println("Stack overflow");
		}
	}

	public T peek() {
		if (top == -1) {
			System.out.println("Stack Empty");
			return null;
		} else
			return s.get(top);
	}

	public T pop() {
		if (top == -1) {
			System.out.println("Stack Empty");
			return null;
		} else {
			int temp = top;
			top = top - 1;
			return s.get(temp);
		}
	}
	
	public boolean isEmpty() {
		return top == -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
