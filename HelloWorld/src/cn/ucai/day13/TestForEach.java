package cn.ucai.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestForEach {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("two");
		list.add("six");
		
		/*for(Iterator<String> it = list.iterator();it.hasNext();){
			System.out.println(it.next());
		}*/
		
		// 1.5之后 foreach循环 底层是Iterator
		for(String s:list){
			System.out.println(s);
		}
		
		int[] niArr = {1,2,3,4};
		for(int i:niArr){
			System.out.println(i);
		}
	}
}
