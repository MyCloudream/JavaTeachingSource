package cn.ucai.day13;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * �������ַ�ʽ��
 * 1����Ԫ��������пɱȽ���java.lang.Comparable
 * 2���ü��ϱ������һ���Ƚ��� java.util.Compatator
 */
public class TestCompator {
	public static void main(String[] args) {
		Set<Person> set = new TreeSet<Person>(new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				return o2.getAge()-o1.getAge();
			}
		});
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
