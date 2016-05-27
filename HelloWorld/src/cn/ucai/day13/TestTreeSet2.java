package cn.ucai.day13;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * HashSet：
 * 依据hashCode()和equals()
 * Set接口另外一个子实现类：
 * TreeSet：底层是二叉树 
 * 1、无序（录入顺序和取出顺序不一致）
 * 2、元素不能重复 依据于compareTo()方法
 * 3、想排序，首先元素需要具有可比较性
 * 
 * Comparable：
 */
public class TestTreeSet2 {
	public static void main(String[] args) {
		Set<Person> set = new TreeSet<Person>();
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
