package com.katalyst.one;

import com.katalyst.MyInterface;

public class DemoInOtherPackage {
	public static void main(String[] args) {

		MyInterface m = (a, b) -> a + b;

		MyInterface m1 = (a, b) -> a - b;

		MyInterface m2 = (a, b) -> a * b;

		MyInterface m3 = (a, b) -> a / b;

		System.out.println(m.performAction(10, 2));
		System.out.println(m1.performAction(10, 2));
		System.out.println(m2.performAction(10, 2));
		System.out.println(m3.performAction(10, 2));

	}

}
