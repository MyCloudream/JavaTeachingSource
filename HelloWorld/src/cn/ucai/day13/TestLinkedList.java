package cn.ucai.day13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList和Vector：底层是数组
 * LinkedList：双向链表:频繁插入的时候
 * ArrayList：频繁查找数据
 */
public class TestLinkedList {
	public static void main(String[] args) {
		// >> 右移位操作
		// 1000 = 8
		// 0100 = 4
		// 0010 = 2
		// 0001 = 1
		
		List<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
