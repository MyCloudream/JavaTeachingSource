package cn.ucai.day13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList��Vector���ײ�������
 * LinkedList��˫������:Ƶ�������ʱ��
 * ArrayList��Ƶ����������
 */
public class TestLinkedList {
	public static void main(String[] args) {
		// >> ����λ����
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
