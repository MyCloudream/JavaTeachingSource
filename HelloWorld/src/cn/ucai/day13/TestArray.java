package cn.ucai.day13;

import java.util.ArrayList;

/**
 * ���ϣ��洢���ݵ�����
 * Ԫ�����Ͳ�Ψһ ���Ȳ��̶�  ֻ�ܴ洢������������
 * ����:�洢���͹̶� ���ȹ̶� �ܴ����õ�Ҳ�ܴ������������
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
		
		// ȡ��list�ĳ��ȣ�Ԫ�صĸ�����
		System.out.println(list.size());
		// ����ȫ��Ԫ��
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+",");
		}
		System.out.println();
		System.out.println(list);
		// �޸�ָ��λ���ϵ�Ԫ��
		Object o = list.set(0, "list");
		System.out.println(o);
		System.out.println(list);
		// �����±�ɾ��Ԫ��
		list.remove(1);
		System.out.println(list);
		// ɾ����һ�γ��ֵ�Ԫ��
		list.remove("three");
		System.out.println(list);
		// ��ɾ�Ĳ�
	}
}
