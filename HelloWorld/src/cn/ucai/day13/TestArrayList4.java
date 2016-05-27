package cn.ucai.day13;

import java.util.ArrayList;

/**
 * 泛型：1.5 用于指定集合存储数据的类型
 */
public class TestArrayList4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");// Object o = new String("abc");
		list.add("two");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("two");
		list.add("six");
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).charAt(0));
		}
	}
}
