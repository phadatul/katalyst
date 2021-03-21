package com.katalyst.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<Integer> data1 = new ArrayList<Integer>();
		List<Integer> data2 = new ArrayList<Integer>();

		data1.add(10);
		data1.add(20);

		data2.add(100);
		data2.add(200);

		List<List<Integer>> complexlist = new ArrayList<List<Integer>>();
		complexlist.add(data1);
		complexlist.add(data2);

		System.out.println(complexlist);
		for (int i = 0; i < complexlist.size(); i++) {
			List<Integer> temp = complexlist.get(i);

			for (int j = 0; j < temp.size(); j++) {
				System.out.println(temp.get(j));
			}
		}

	}
}
