package cn.ucai.day09.oo1;
/**
 * ��̬��һ������/�������ù���
 * ��̬����ֻ�ܵ��þ�̬���Ի򷽷�
 * һ�㷽������Ա������ �ܵ���һ�㷽����Ҳ�ܵ��þ�̬����
 * 
 * ����JVM--���ص��ڴ��У�����أ�--��������
 * static ������ص�ʱ��ȷ��
 */
public class Person {
	public static void main(String[] args) {
//		m();
		Person p = null;
		Person.m();
	}
	
	public static void m(){
		System.out.println("static");
	}
	
	public void m2(){
		
	}
}

class T{
	public static void main(String[] args) {
		// ��̬������
		Person.m();
		
		Person p = new Person();
		// The static method m() from the type Person should be accessed in a static way
		p.m();
	}
}