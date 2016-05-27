package cn.ucai.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * StringBuilder/StringBuffer
 * ArrayList/Vector
 * Iterator：迭代器
 * Scanner:扫描器
 */
public class TestIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("two");
		list.add("six");
		// Object o = new String("one");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("one")){
				it.remove();// 把list里面的元素给删除了
				// ConcurrentModificationException 并发修改异常
//				list.remove("one");
//				list.add("1");
			}
			System.out.println(s);
		}
		System.out.println(list);
	}
}
