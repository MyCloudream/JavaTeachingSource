package cn.ucai.day13;

import java.util.ArrayList;

public class TestArrayList2 {
	public static void main(Person[] args) {
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("two");
// 1 2 4 5 2
// 1 4 5 
		System.out.println(list);
		int len = list.size();
		for(int i=list.size()-1;i>=0;i--){// 6
			if(list.get(i).equals("two")){
				list.remove(i);
			}
		}
		System.out.println(list);
		
		while(list.contains("two")){
			list.remove("two");
		}
		
		while(list.remove("two")){
			
		}
	}
}
