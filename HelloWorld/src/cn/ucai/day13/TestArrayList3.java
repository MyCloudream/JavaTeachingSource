package cn.ucai.day13;

import java.util.ArrayList;

public class TestArrayList3 {
	public static void main(Person[] args) {
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("two");
		
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals("two")){
//				list.remove("two");
				list.remove(i);
				i--;
			}
		}
		// 
		System.out.println(list);
	}
}
