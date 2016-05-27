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
 * ����hashCode()��equals()����:
 * �ȱȽ�hashCode() �����һ�£���洢
 * ���һ�� ��Ƚ�equals�������һ�� �洢
 * equalsҲһ��������Ϊ��ͬһ�������򲻴洢
 * 
 */
public class TestSet2 {
	public static void main(Person[] args) {
		Set<Person> set = new HashSet<Person>();
		Person p1 = new Person(20,"��˫");
		Person p2 = new Person(18,"С��");
		Person p3 = new Person(40,"����");
		Person p4 = new Person(20,"����");
		Person p5 = new Person(30,"����");
		Person p6 = new Person(18,"С��");
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		// ȡ��set�ĵ�����
		Iterator<Person> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println(set.size());
		
		
	}
}
