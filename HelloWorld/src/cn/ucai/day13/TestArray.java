package cn.ucai.day13;

import java.util.ArrayList;

/**
 * 集合：存储数据的容器
 * 元素类型不唯一 长度不固定  只能存储引用数据类型
 * 数组:存储类型固定 长度固定 能存引用的也能存基本数据类型
 */
public class TestArray {
	public static void main(Person[] args) {
		/*int[] niArr = new int[10];
		niArr[10] = 1;*/
		
		ArrayList list = new ArrayList();
		list.add("one");
		list.add(1);
		list.add(true);//Boolean 
		list.add(null);
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("three");
		list.add(1, "array");
		
		// 取得list的长度（元素的个数）
		System.out.println(list.size());
		// 查找全部元素
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+",");
		}
		System.out.println();
		System.out.println(list);
		// 修改指定位置上的元素
		Object o = list.set(0, "list");
		System.out.println(o);
		System.out.println(list);
		// 按照下标删除元素
		list.remove(1);
		System.out.println(list);
		// 删除第一次出现的元素
		list.remove("three");
		System.out.println(list);
		// 增删改查
	}
}
