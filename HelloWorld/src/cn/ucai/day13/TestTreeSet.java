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
 * 3�������ֵ�˳���Ԫ���Զ�����
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
