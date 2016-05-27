package cn.ucai.day13;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * 游标：可以移动的标志位
 */
public class TestIterator2 {
	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		Iterator<String> it1 = list.iterator();
		while(it1.hasNext()){
			String s = it1.next();
			System.out.print(s+",");
		}
		System.out.println();
		Iterator<String> it2 = list.iterator();
		while(it2.hasNext()){
			String s = it2.next();
			System.out.println(s);
		}
		System.out.println("hello");
		
		/*for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		// 错误1
		/*while(list.iterator().hasNext()){
			String s = list.iterator().next();
			System.out.println(s);
		}
		*/
		// 错误2
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(it.next());
		}*/
	}
}
