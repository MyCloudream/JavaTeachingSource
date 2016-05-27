package cn.ucai.day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * List:�������˳���ȡ��˳��һ�£����б�  Ԫ�ؿ����ظ�   
 * contains��remove������������equals
 * 
 * Set���������˳���ȡ��˳��һ�£��б�  Ԫ�ز����ظ����Զ�ȥ�أ�
 * HashSet:�ײ���һ����ϣ�� 
 * ����hashcode()��equals()����:
 * �ȱȽ�hashcode() �����һ�£���洢
 * ���һ�� ��Ƚ�equals�������һ�� �洢
 * equalsҲһ��������Ϊ��ͬһ�������򲻴洢
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
		// ȡ��set�ĵ�����
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println(set.size());
		
		
	}
}
