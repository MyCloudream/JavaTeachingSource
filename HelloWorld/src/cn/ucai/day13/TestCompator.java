package cn.ucai.day13;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 排序两种方式：
 * 1、让元素自身具有可比较性java.lang.Comparable
 * 2、让集合本身具有一个比较器 java.util.Compatator
 */
public class TestCompator {
	public static void main(String[] args) {
		Set<Person> set = new TreeSet<Person>(new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				return o2.getAge()-o1.getAge();
			}
		});
		Person p1 = new Person(10,"L李双");
		Person p2 = new Person(20,"X小栗");
		Person p3 = new Person(30,"S尚鹏");
		Person p4 = new Person(40,"D大宇");
		Person p5 = new Person(50,"G国庆");
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
