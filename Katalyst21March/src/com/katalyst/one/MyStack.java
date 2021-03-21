package com.katalyst.one;

import java.util.ArrayList;

public class MyStack<T> {   //GENERIC - PARAMETER PASSED TO A TYPE
	ArrayList<T> al = new ArrayList<T>();

	public MyStack() {
		// TODO Auto-generated constructor stub
	}

	public void pust(T data) {

		al.add(data);
	}

	public T pop() {
		T removedElement = al.get(al.size() - 1);

		al.remove(al.size() - 1);
		return removedElement;
	}

	public void printData() {
		System.out.println(al);
	}

}
