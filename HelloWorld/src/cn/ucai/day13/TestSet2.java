package cn.ucai.day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * List:有序（添加顺序和取出顺序一致）的列表  元素可以重复   
 * contains和remove方法依赖的是equals
 * 
 * Set：无序（添加顺序和取出顺序不一致）列表  元素不能重复（自动去重）
 * HashSet:底层是一个哈希表 
 * 依据hashCode()和equals()方法:
 * 先比较hashCode() 如果不一致，则存储
 * 如果一致 则比较equals，如果不一致 存储
 * equals也一样，则认为是同一个对象，则不存储
 * 
 */
public class TestSet2 {
	public static void main(Person[] args) {
		Set<Person> set = new HashSet<Person>();
		Person p1 = new Person(20,"李双");
		Person p2 = new Person(18,"小栗");
		Person p3 = new Person(40,"尚鹏");
		Person p4 = new Person(20,"大宇");
		Person p5 = new Person(30,"国庆");
		Person p6 = new Person(18,"小栗");
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		// 取得set的迭代器
		Iterator<Person> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println(set.size());
		
		
	}
}
