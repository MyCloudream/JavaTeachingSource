package cn.ucai.day13;

import java.util.List;
import java.util.Vector;

/**
 * StringBuilder/StringBuffer
 * ArrayList/Vector
 */
public class TestVector {
	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("two");
		list.add("six");
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
