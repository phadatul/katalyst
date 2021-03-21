package com.katalyst.one;

import java.util.ArrayList;
import java.util.Collections;

public class DemoCollections {

	public static void main(String[] args) {

		Employee e1 = new Employee(11, "abcd", 99123);
		Employee e2 = new Employee(6, "mnop", 67890);
		Employee e3 = new Employee(1, "pqrs", 33456);
		Employee e4 = new Employee(99, "efgh", 78000);

		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		Collections.sort(al);

		System.out.println(al);
	}

}
