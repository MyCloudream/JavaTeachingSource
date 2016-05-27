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
 * 3、按照字典顺序把元素自动排序
 */
public class TestTreeSet {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("B");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("F");
		set.add("A");
		set.add("E");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
