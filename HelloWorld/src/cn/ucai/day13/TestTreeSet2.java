package cn.ucai.day13;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * HashSet��
 * ����hashCode()��equals()
 * Set�ӿ�����һ����ʵ���ࣺ
 * TreeSet���ײ��Ƕ����� 
 * 1������¼��˳���ȡ��˳��һ�£�
 * 2��Ԫ�ز����ظ� ������compareTo()����
 * 3������������Ԫ����Ҫ���пɱȽ���
 * 
 * Comparable��
 */
public class TestTreeSet2 {
	public static void main(String[] args) {
		Set<Person> set = new TreeSet<Person>();
		Person p1 = new Person(10,"L��˫");
		Person p2 = new Person(20,"XС��");
		Person p3 = new Person(30,"S����");
		Person p4 = new Person(40,"D����");
		Person p5 = new Person(50,"G����");
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		Iterator<Person> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
