package cn.ucai.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestGeneric2 {
	public static void main(String[] args) {
		TestGeneric2 tg = new TestGeneric2();
		
		List<Number> list = new ArrayList<Number>();
		list.add(123);// int--Integer--Number
		list.add(345);
		list.add(135);
		tg.myIterator(list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(123);
		list2.add(345);
		list2.add(135);
		tg.myIterator(list2);

	}
	// 泛型的通配符 ？extends Number :当前可以传入Number及其子类
	public void myIterator(List<? extends Number> list){
		Iterator<? extends Number> it2 = list.iterator();
		while(it2.hasNext()){
			Number s = it2.next();
			System.out.println(s);
		}
	}
	// 表示当前可以传入Integer及其父类
	public void myIterator2(List<? super Integer> list){
		Iterator<? super Integer> it2 = list.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}
	
	public void myIterator3(List<?> list){
		Iterator<?> it2 = list.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}
}
