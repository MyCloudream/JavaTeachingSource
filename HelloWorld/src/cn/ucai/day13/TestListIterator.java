package cn.ucai.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator:专门为List准备的迭代器
 */
public class TestListIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		// 
		ListIterator<String> it = list.listIterator(list.size());
		System.out.println(it.hasPrevious());
		while(it.hasPrevious()){
			String s = it.previous();
			System.out.println(s);
		}
		/*while(it.hasNext()){
			String s = it.next();
			if(s.equals("one")){
				it.add("0");
			}
			System.out.println(s);
		}
		System.out.println(list);*/
	}
}
