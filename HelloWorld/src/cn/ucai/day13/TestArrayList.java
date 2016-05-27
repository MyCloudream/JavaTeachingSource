package cn.ucai.day13;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(Person[] args) {
		ArrayList list = new ArrayList();
		list.add("zero");
		list.add(2);
		list.add("three");
		list.add("four");
		//  Object o = new Integer(1);
		list.add(1);// 1.5 Integer i = 1;
		
		System.out.println(list);
		list.remove(new Integer(1));
		System.out.println(list);
		
		
	}
}
