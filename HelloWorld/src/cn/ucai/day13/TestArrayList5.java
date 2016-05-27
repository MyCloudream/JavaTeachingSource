package cn.ucai.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 泛型：1.5 用于指定集合存储数据的类型
 */
public class TestArrayList5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
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
		// 
		Collection<String> coll = new ArrayList<String>();
		coll.add("one");// Object o = new String("abc");
		coll.add("two");
		coll.add("two");
		coll.add("three");
		coll.add("four");
		Object[] strArr = coll.toArray();//strArr[i]
		for(int i=0;i<strArr.length;i++){
			System.out.println(strArr[i]);
		}
		
	}
}
