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
 * 依据hashcode()和equals()方法:
 * 先比较hashcode() 如果不一致，则存储
 * 如果一致 则比较equals，如果不一致 存储
 * equals也一样，则认为是同一个对象，则不存储
 * 
 */
public class TestSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		// 取得set的迭代器
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println(set.size());
		
		
	}
}
